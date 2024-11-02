package org.example.csrfimplementationdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Hello From Home";
    }

    @PostMapping("/home")
    public String mutatingResource() {
        return "Hello From Mutating Resource";
    }
}
