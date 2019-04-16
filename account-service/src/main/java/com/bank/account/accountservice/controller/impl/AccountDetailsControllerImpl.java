package com.bank.account.accountservice.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.accountservice.constants.RestfulEndPoints;
import com.bank.account.accountservice.controller.AccountDetailsController;

/**
 * Account Details service resource.
 * 
 * @author Deepak Bhalla
 *
 */
@RestController
@RequestMapping(value = RestfulEndPoints.ACCOUNT_RESOURCE)
public class AccountDetailsControllerImpl implements AccountDetailsController {

    @Autowired
    private Environment env;

    /**
     * Sevice health check resource.
     */
    @GetMapping(path = RestfulEndPoints.ACCOUNT_HEALTH_CHECK)
    public String healthCheck() {
        return "Hello, I am 'Account Service' and running quite healthy at port: "
                + env.getProperty("local.server.port");
    }
}
