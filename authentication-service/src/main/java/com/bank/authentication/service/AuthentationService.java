package com.bank.authentication.service;

import java.util.Date;
import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.authentication.entity.Login;
import com.bank.authentication.exception.AuthenticationException;
import com.bank.authentication.exception.RegistrationException;
import com.bank.authentication.model.CustomerDetails;
import com.bank.authentication.repository.AuthenticationRepository;

/**
 * Service to perform different authentication related operations.
 *
 * @author Deepak Bhalla
 */
@Service
public class AuthentationService {

    @Autowired
    AuthenticationRepository authenticationRepository;

    /**
     * Customer logon details are first authenticated in [CUSTOMER_LOGIN_DETAILS]
     * table which is present in this microservice directly. Each customer record
     * has a unique <party_sys_id> in this table.
     * 
     * If found, then for the retrieved <party_sys_id>, it calls 'CUSTOMER-SERVICE'
     * microservice to retrieves the customer details.
     *
     * @param username
     * @param password
     * @return customerDetails
     * @throws AuthenticationException
     */
    public CustomerDetails authenticateCustomer(String username, String password) throws AuthenticationException {

        CustomerDetails authenticatedCustomer = null;
        // Database call to check logon details and customer-service microservice
        List<Login> loginResult = authenticationRepository.findByLoginDetails(username, password);
        if (loginResult.size() > 0) {
            Long partySysId = loginResult.get(0).getPartySysId();
            System.out.println("Customer authenticatd, party sys id: " + partySysId);

            // call to get customer details.
            authenticatedCustomer = new CustomerDetails(partySysId, "deepakbhalla", "password", "Deepak", "middleName",
                    "lastName", new Date(), "address", "gender", "meritalStatus", "emailAddress",
                    "nationalInsuranceNumber");
        }
        return authenticatedCustomer;
    }

    /**
     * Record of customer logon details are created first in
     * [CUSTOMER_LOGIN_DETAILS] table. Then it creates a customer record by calling
     * 'CUSTOMER-SERVICE' microservice.
     * 
     * @param customerDetails
     * @return customerDetails
     * @throws AuthenticationException
     */
    public boolean recordLoginDetails(Login loginEntity) throws RegistrationException {

        boolean registered = false;
        try {

            List<Login> loginResult = authenticationRepository.findByLoginDetails(loginEntity.getUsername(),
                    loginEntity.getPassword());

            if (loginResult.size() > 0) {
                
            }

            // Database call to record logon details and customer-service
            Login savedRecord = authenticationRepository.save(loginEntity);
            registered = true;
        } catch (Exception exception) {
            throw new RegistrationException("Login registration failed", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }

        // Microservice call to record customer details.
        CustomerDetails registeredCustomer = new CustomerDetails(Long.valueOf(123456), "deepakbhala", "password",
                "Deepak", "middleName", "lastName", new Date(), "address", "gender", "meritalStatus", "emailAddress",
                "nationalInsuranceNumber");
        return registered;
    }
}
