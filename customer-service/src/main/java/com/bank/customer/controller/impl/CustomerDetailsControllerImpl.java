package com.bank.customer.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.constants.RestfulEndPoints;
import com.bank.customer.controller.CustomerDetailsController;
import com.bank.customer.model.CustomerDetails;
import com.bank.customer.service.CustomerDetailsService;

@RestController
@RequestMapping(value = RestfulEndPoints.CUSTOMER_RESOURCE)
public class CustomerDetailsControllerImpl implements CustomerDetailsController {

    @Autowired
    CustomerDetailsService customerDetailsService;

    @GetMapping("/hello")
    public String healthCheck() {
        return "Hello, I am all right, hope you are doing well.";
    }

    @Override
    @GetMapping(path = "/{party}")
    public List<CustomerDetails> retrieveCustomer(@PathVariable(name = "party") int partySysId) {
        return customerDetailsService.retrieveCustomer(Long.valueOf(partySysId));
    }
}
