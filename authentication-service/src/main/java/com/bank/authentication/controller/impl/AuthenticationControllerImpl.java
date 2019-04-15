package com.bank.authentication.controller.impl;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.authentication.constants.RestfulEndPoints;
import com.bank.authentication.controller.AuthenticationController;
import com.bank.authentication.entity.Login;
import com.bank.authentication.exception.AuthenticationException;
import com.bank.authentication.exception.RegistrationException;
import com.bank.authentication.model.AuthenticationResponse;
import com.bank.authentication.model.CustomerDetails;
import com.bank.authentication.model.RegistrationResponse;
import com.bank.authentication.service.AuthentationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Responsible for authentication tasks (login, registration etc.).
 * 
 * @author Deepak Bhalla
 *
 */
@RestController
@RequestMapping(value = RestfulEndPoints.AUTHENTICATION_RESOURCE)
@Api(value = "authentication", description="Operations pertaining to customer authentication.")
public class AuthenticationControllerImpl implements AuthenticationController {

    /**
     * Service class dependency.
     */
    @Autowired
    private AuthentationService authenticationService;

    @Autowired
    private Environment env;

    /**
     * Sevice health check resource.
     */
    @ApiOperation(value = "Check the heart beat.")
    @GetMapping(path = RestfulEndPoints.AUTHENTICATION_HEALTH_CHECK)
    public String healthCheck() {
        return "Hello, I am 'Authentication Service' and running quite healthy at port: "
                + env.getProperty("local.server.port");
    }

    /**
     * Register new customer.
     * 
     * @param username
     * @param password
     * @return response - AuthenticationResponse
     */
    @Override
    @ApiOperation(value = "Authenticate customer")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully authenticated the customer."),
            @ApiResponse(code = 401, message = "Customer authentication failed."),
            @ApiResponse(code = 500, message = "Something went wrong. Internal server error.")
    })
    @GetMapping(path = RestfulEndPoints.AUTHENTICATION_LOGON)
    public ResponseEntity<AuthenticationResponse> authenticateUser(@RequestHeader String username,
            @RequestHeader String password) {

        ResponseEntity<AuthenticationResponse> responseEntity = null;

        try {
            CustomerDetails authenticatedCustomer = authenticationService.authenticateCustomer(username, password);

            boolean isAuthenticated = authenticatedCustomer != null && authenticatedCustomer.getPartySysId() != 0;

            responseEntity = isAuthenticated
                    ? (ResponseEntity.status(HttpStatus.SC_OK)
                            .body(new AuthenticationResponse("User authenticated successfully", HttpStatus.SC_OK,
                                    authenticatedCustomer)))
                    : (ResponseEntity.status(HttpStatus.SC_UNAUTHORIZED).body(new AuthenticationResponse(
                            "User not found", HttpStatus.SC_UNAUTHORIZED, authenticatedCustomer)));

        } catch (AuthenticationException exception) {
            responseEntity = ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR).body(new AuthenticationResponse(
                    "Authentication failed, " + exception, HttpStatus.SC_INTERNAL_SERVER_ERROR, null));
        }
        return responseEntity;
    }

    /**
     * Registers new customer.
     * 
     * @param customerDetails
     * @return response - AuthenticationResponse
     */
    @Override
    @PostMapping(path = RestfulEndPoints.AUTHENTICATION_REGISTER)
    public RegistrationResponse registerCustomer(@RequestBody CustomerDetails customerDetails,
            @RequestHeader String username, @RequestHeader String password) {
        RegistrationResponse response = null;
        try {
            // Register logon details
            boolean registeredCustomer = authenticationService.recordLoginDetails(new Login(username, password));

            if (registeredCustomer) {
                response = new RegistrationResponse(true, "User registered successfully", HttpStatus.SC_OK);

                // TODO - Create customer record
            } else {
                response = new RegistrationResponse(false, "User registration failed",
                        HttpStatus.SC_INTERNAL_SERVER_ERROR);
            }
        } catch (RegistrationException exception) {
            response = new RegistrationResponse(false, "User registration failed, " + exception,
                    HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        return response;
    }
}
