package com.taboola.mavenworkshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "maven/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello Campers!";
    }
}
