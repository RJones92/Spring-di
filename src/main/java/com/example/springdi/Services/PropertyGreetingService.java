package com.example.springdi.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - PROPERTY greeting service implementation!";
    }
}
