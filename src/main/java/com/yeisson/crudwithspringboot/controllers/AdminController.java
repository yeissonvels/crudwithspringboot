package com.yeisson.crudwithspringboot.controllers;

import com.yeisson.crudwithspringboot.models.User;
import com.yeisson.crudwithspringboot.repositories.UserRepository;
import com.yeisson.crudwithspringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public String showUsers(Model model) {
        UserService userService = new UserService(userRepository);
        Iterable<User> users = userService.list();
        for(User user: users) {
            System.out.println(user.getId() +  " " + user.getEmail());
        }

        model.addAttribute("users", users);

        return "admin/users";
    }

    @GetMapping("/save-user")
    public String saveUser() {
        User user = new User();
        user.setEmail("prueba@gmail.com");
        user.setPassword("11111111");
        UserService userService = new UserService(userRepository);
        userService.saveUser(user);
        System.out.println("User saved!");
        return "index";
    }
}
