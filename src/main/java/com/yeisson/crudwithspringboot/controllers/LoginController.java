package com.yeisson.crudwithspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/login")
    @GetMapping("/login")
    public String Login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password, Model model) {
        System.out.println("Email: " + email + " password: " + password);
        if(email.equalsIgnoreCase("yeisson@test.com") && password.equalsIgnoreCase("12345")) {
            model.addAttribute("message", "Login Ok!");
        } else {
            model.addAttribute("error", "Email or password incorrect!");
        }
        return "index";
    }
}
