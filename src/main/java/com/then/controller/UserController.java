package com.then.controller;

import com.then.entity.User;
import com.then.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public User login(String username,String password){
        return userService.login(username,password);
    }
}
