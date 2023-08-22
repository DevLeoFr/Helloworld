package com.example.service;

import com.example.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld(){
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
