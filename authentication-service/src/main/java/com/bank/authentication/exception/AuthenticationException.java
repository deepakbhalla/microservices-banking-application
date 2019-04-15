package com.bank.authentication.exception;

/**
 * Exception class for authentication operation.
 * 
 * @author Deepak Bhalla
 *
 */
public class AuthenticationException extends Exception {

    private static final long serialVersionUID = -4598129403925097427L;
    private String errorMessage;
    private int errorCode;

    public AuthenticationException(String errorMessage, int errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
