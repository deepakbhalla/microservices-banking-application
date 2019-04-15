/**
 * 
 */
package com.bank.authentication.controller;

import org.springframework.http.ResponseEntity;

import com.bank.authentication.model.AuthenticationResponse;
import com.bank.authentication.model.CustomerDetails;
import com.bank.authentication.model.RegistrationResponse;

/**
 * Responsible for authentication tasks (login, registration etc.).
 * 
 * @author Deepak Bhalla
 *
 */
public interface AuthenticationController {

    /**
     * For the resource health check.
     * 
     * @return
     */
    public String healthCheck();

    /**
     * Authenticate a given customer.
     * 
     * @param username
     * @param password
     * @return CustomerDetails
     */
    public ResponseEntity<AuthenticationResponse> authenticateUser(String username, String password);

    /**
     * Registers a new customer.
     * 
     * @param customerDetails
     * @return boolean - success/failure
     */
    public RegistrationResponse registerCustomer(CustomerDetails customerDetails, String username, String password);
}
