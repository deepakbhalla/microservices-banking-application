package com.bank.account.accountservice.controller;

import java.util.List;

public interface AccountDetailsController {

    /**
     * For the resource health check.
     * @return
     */
    public String healthCheck();
    
    // public List<Account> retrieveAccounts(int partySysId);
}
