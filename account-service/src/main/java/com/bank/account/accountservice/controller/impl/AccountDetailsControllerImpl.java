package com.bank.account.accountservice.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.accountservice.constants.RestfulEndPoints;
import com.bank.account.accountservice.controller.AccountDetailsController;
import com.bank.account.accountservice.model.Account;
import com.bank.account.accountservice.service.AccountDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Account Details service resource.
 * 
 * @author Deepak Bhalla
 *
 */
@RestController
@RequestMapping(value = RestfulEndPoints.ACCOUNT_RESOURCE)
@Api(value = "account", description="Operations pertaining to account details.")
public class AccountDetailsControllerImpl implements AccountDetailsController {

    @Autowired
    AccountDetailsService accountDetailsService;

    @Autowired
    private Environment env;

    /**
     * Sevice health check resource.
     */
    @ApiOperation(value = "Check the heart beat.")
    @GetMapping(path = RestfulEndPoints.ACCOUNT_HEALTH_CHECK)
    public String healthCheck() {
        return "Hello, I am 'Account Service' and running quite healthy at port: "
                + env.getProperty("local.server.port");
    }
    

    @Override
    @ApiOperation(value = "Get accounts")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully fetched the accounts."),
            @ApiResponse(code = 401, message = "Accounts retrieval failed."),
            @ApiResponse(code = 500, message = "Something went wrong. Internal server error.")
    })
    @GetMapping(path = RestfulEndPoints.ACCOUNT_RETRIEVE)
    public List<Account> retrieveAccounts(@PathVariable(name = "party") Long party_sys_id) {
        return accountDetailsService.retrieveAccounts(party_sys_id);
    }
}
