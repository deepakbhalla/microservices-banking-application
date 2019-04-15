package com.bank.customer.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.constants.RestfulEndPoints;
import com.bank.customer.controller.CustomerDetailsController;
import com.bank.customer.model.CustomerDetails;
import com.bank.customer.service.CustomerDetailsService;

/**
 * Customer Details service resource.
 * 
 * @author Deepak Bhalla
 *
 */
@RestController
@RequestMapping(value = RestfulEndPoints.CUSTOMER_RESOURCE)
public class CustomerDetailsControllerImpl implements CustomerDetailsController {

    @Autowired
    CustomerDetailsService customerDetailsService;

    @Autowired
    private Environment env;

    /**
     * Sevice health check resource.
     */
    @GetMapping(path = RestfulEndPoints.CUSTOMER_HEALTH_CHECK)
    public String healthCheck() {
        return "Hello, I am 'Customer Service' and running quite healthy at port: "
                + env.getProperty("local.server.port");
    }

    /**
     * Retrieves customer for a given party id.
     */
    @Override
    @GetMapping(path = RestfulEndPoints.CUSTOMER_RETRIEVE)
    public List<CustomerDetails> retrieveCustomer(@PathVariable(name = "party") int partySysId) {
        return customerDetailsService.retrieveCustomer(Long.valueOf(partySysId));
    }
}
