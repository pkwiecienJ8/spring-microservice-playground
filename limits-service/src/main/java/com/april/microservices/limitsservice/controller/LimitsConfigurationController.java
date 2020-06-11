package com.april.microservices.limitsservice.controller;

import com.april.microservices.limitsservice.Configuration;
import com.april.microservices.limitsservice.entity.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    @Autowired
    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
