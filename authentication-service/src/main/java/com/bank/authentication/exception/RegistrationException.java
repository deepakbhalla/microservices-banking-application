package com.bank.authentication.exception;

/**
 * Exception class for registration operation.
 * 
 * @author Deepak Bhalla
 *
 */
public class RegistrationException extends Exception {

    private static final long serialVersionUID = -959769090157600065L;
    private String errorMessage;
    private int errorCode;

    public RegistrationException(String errorMessage, int errorCode) {
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
