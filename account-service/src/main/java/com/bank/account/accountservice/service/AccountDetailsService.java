package com.bank.account.accountservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.accountservice.model.Account;
import com.bank.account.accountservice.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {

    @Autowired
    AccountDetailsRepository accountDetailsRepository;

    public List<Account> retrieveAccounts(Long partySysId) {
        return accountDetailsRepository.findByPartysysid(partySysId);
    }
}
