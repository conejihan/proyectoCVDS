package edu.eci.cvds.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("deprecation")
@ManagedBean(name = "CategoryBean")
@ViewScoped

public class CategoryBean implements Serializable {

	private static final long serialVersionUID = 4749318204103001772L;

	private static final Logger log = LoggerFactory.getLogger(LoginBean.class);

	// private CategoryService categoryService;

	public CategoryBean() {

	}

}