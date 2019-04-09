package com.bank.customer.controller;

import java.util.List;
import com.bank.customer.model.CustomerDetails;

public interface CustomerDetailsController {

    /**
     * For the resource health check.
     * @return
     */
    public String healthCheck();

    public List<CustomerDetails> retrieveCustomer(int partySysId);
}
