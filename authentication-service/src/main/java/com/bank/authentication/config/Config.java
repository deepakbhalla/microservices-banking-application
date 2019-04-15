package com.bank.authentication.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configurations.
 * 
 * @author Deepak Bhalla
 *
 */
@Configuration
public class Config {

    @Bean
    @LoadBalanced // Load balance between service instances running at different ports.
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
