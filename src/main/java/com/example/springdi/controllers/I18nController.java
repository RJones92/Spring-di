package com.example.springdi.controllers;

import com.example.springdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    //look in application.properties file to specify the service 'profile'
    public I18nController(@Qualifier("i18nService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
