package com.example.user.service;
import com.example.user.service.Service;
import com.example.user.repository.UserRepository;
import com.example.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import java.util.List;


public class Service {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
