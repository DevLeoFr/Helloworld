package com.example.service;

import com.example.model.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessServiceConfig {
    @Bean
    public BusinessService businessService() {
        return new BusinessService();
    }
}
