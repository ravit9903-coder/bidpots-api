package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    // REGISTER
    @PostMapping("/register")
    public String register(@RequestBody User user) {

        User existingUser = userRepository.findByEmail(user.getEmail());

        if(existingUser != null){
            return "Email already registered";
        }

        userRepository.save(user);
        return "User Registered Successfully";
    }

    // LOGIN
    @PostMapping("/login")
    public Object login(@RequestBody User user){

        User existingUser = userRepository.findByEmailAndPassword(
                user.getEmail(),
                user.getPassword()
        );

        if(existingUser == null){
            return "Invalid Email or Password";
        }

        return existingUser;
    }
}
   