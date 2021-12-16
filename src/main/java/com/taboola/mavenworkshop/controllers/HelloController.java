package com.taboola.mavenworkshop.controllers;

import java.util.HashSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Sets;

@RestController
@RequestMapping(value = "maven/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        HashSet<String> names = Sets.newHashSet("Alon", "Roni", "Noga");
        return "Hello " + names;
    }
}
