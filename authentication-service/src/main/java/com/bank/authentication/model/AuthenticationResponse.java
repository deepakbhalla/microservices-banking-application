package com.bank.authentication.model;

import java.io.Serializable;

/**
 * Class for authentication response.
 * 
 * @author Deepak Bhalla
 *
 */
public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1216914398681559012L;
    private String message;
    private int status;
    private CustomerDetails customerDetails;

    public AuthenticationResponse(String message, int status, CustomerDetails customerDetails) {
        this.message = message;
        this.status = status;
        this.customerDetails = customerDetails;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }
}
