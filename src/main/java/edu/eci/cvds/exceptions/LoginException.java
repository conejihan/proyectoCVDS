package edu.eci.cvds.exceptions;

public class LoginException extends Exception {

    private static final long serialVersionUID = 5758585917279118959L;

    public LoginException(String message, Exception e) {
        super(message, e);
    }

    public LoginException(String message) {
        super(message);
    }
}
