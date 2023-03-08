package com.yeisson.crudwithspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String indexPage() {
        System.out.println("En home page");
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "frontend/login";
    }
}
