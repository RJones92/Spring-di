package com.example.springdi.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - CONSTRUCTOR greeting service implementation!";
    }

}
