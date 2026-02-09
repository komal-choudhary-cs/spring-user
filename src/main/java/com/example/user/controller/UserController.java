

package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Service service;

    
    @PostMapping
    
    public User addUser( User user) {
        return service.addUser(user);
    }

    
    @GetMapping
    public List<User> getUsers() {
        return service.getUsers();
    }
}

