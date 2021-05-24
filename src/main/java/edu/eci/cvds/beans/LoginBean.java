package edu.eci.cvds.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("deprecation")
@ManagedBean(name = "LoginBean")
@ViewScoped

public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1786817762900763101L;

	private static final Logger log = LoggerFactory.getLogger(LoginBean.class);

	private String email;
	private String password;
	private Boolean remembered;
	private Boolean isLogged;

	public void doLogin() {
		Subject currentUser = getSubject();
		String hash = new Sha256Hash(getPassword()).toHex();
		System.out.println("hash ========="+hash);
		UsernamePasswordToken token = new UsernamePasswordToken(getEmail(),hash);
		getRemembered();
		System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		try {

			currentUser.login(token);
			currentUser.getSession().setAttribute("email", email);
			System.out.println("entrooooooooooooooooooooooooooo");
			FacesContext.getCurrentInstance().getExternalContext().redirect("/../public/AdminPage.xhtml");

		} catch (UnknownAccountException e) {
			System.out.println("Unknown Account");
			manageError("Unknown Account", "Error");
			log.error(e.getMessage(), e);
		} catch (IncorrectCredentialsException e) {
			System.out.println("Invalid Credentials");
			manageError("Invalid Credentials", "Unknown Email or Password");
			log.error(e.getMessage(), e);
		} catch (LockedAccountException e) {
			System.out.println("Locked Account");
			manageError("Locked Account", "Locked Account");
			log.error(e.getMessage(), e);
		} catch (AuthenticationException e) {
			System.out.println("Authentication Error");
			manageError("Authentication Error", e.getMessage());
			log.error(e.getMessage(), e);
		} catch (IOException e) {
			e.printStackTrace();
			manageError("Unknown Error", e.getMessage());
			log.error(e.getMessage(), e);
		}
	}

	public void closeSession() {
		SecurityUtils.getSubject().logout();
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml");
		} catch (IOException e) {
			java.util.logging.Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, e);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private void manageError(String message, String detail) {
		FacesContext.getCurrentInstance().addMessage("Shiro",
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, detail));
	}

	public Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	public Boolean getRemembered() {
		return remembered;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public Boolean isLogged() {
		return isLogged;
	}

	public void setRemembered(Boolean isRemembered) {
		this.remembered = isRemembered;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public void setPassword(String newPassword) {
		this.password = newPassword;
	}

	public void setLogged(Boolean isLogged) {
		this.isLogged = isLogged;
	}


}