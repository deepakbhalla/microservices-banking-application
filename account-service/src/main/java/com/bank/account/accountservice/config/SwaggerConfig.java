package com.bank.account.accountservice.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bank.account.accountservice.constants.RestfulEndPoints;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.bank.account.accountservice.controller.impl"))
                .paths(regex(RestfulEndPoints.ACCOUNT_RESOURCE.concat(".*"))).build().apiInfo(metaData());
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo("Banking Application", "Spring Boot REST API for Account Details", "1.0",
                "", new Contact("Deepak Bhalla", "", ""), "", "");
        return apiInfo;
    }
}
