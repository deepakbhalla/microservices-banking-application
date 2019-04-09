package com.bank.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.model.CustomerDetails;
import com.bank.customer.repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsService {

    @Autowired
    CustomerDetailsRepository customerRepository;

    public List<CustomerDetails> retrieveCustomer(Long partySysId) {
        return customerRepository.findByPartySysId(partySysId);
    }
}
