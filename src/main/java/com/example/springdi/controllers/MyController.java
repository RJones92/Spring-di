package com.example.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello world! From MyController.java");

        return "Well hi there. A String returned from MyController.java";
    }
}
