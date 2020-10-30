package com.example.springdi.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - SETTER greeting service implementation!";

    }
}
