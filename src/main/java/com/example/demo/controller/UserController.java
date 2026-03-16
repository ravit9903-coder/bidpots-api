package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*") 
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/profile/{email}")
    public User getProfile(@PathVariable String email) {

        return userRepository.findByEmail(email);
    }
}