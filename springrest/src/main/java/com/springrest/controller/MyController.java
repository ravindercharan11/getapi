package com.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    //create get api using springboot//
    @GetMapping("/house")
    public String home(){
        return "this is my get api";

    }
}
