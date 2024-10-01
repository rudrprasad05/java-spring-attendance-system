package com.assignment3.cs241.Group6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // This will look for a Thymeleaf template named "home.html"
    }
}

