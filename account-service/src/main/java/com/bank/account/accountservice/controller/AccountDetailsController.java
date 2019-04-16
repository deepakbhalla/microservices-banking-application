package com.bank.account.accountservice.controller;

import java.util.List;

import com.bank.account.accountservice.model.Account;

public interface AccountDetailsController {

    /**
     * For the resource health check.
     * 
     * @return
     */
    public String healthCheck();

    /**
     * Returns the list of accounts for a given customer party sys id.
     * 
     * @param partySysId
     * @return
     */
    public List<Account> retrieveAccounts(Long partySysId);
}
