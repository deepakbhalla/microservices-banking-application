package com.bank.authentication.model;

/**
 * Class for registration response.
 * 
 * @author Deepak Bhalla
 *
 */
public class RegistrationResponse {

    private boolean isRegistered;
    private String message;
    private int status;

    public RegistrationResponse(boolean isRegistered, String message, int status) {
        super();
        this.isRegistered = isRegistered;
        this.message = message;
        this.status = status;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
