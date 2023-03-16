package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    

    @GetMapping("/get")
    public String user(){
        return "Welcome !";
    }

    
}
