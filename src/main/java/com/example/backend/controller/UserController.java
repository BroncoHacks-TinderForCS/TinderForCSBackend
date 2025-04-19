package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
import com.example.backend.service.UserService;

@RestController
@RequestMapping("/users") // code listens here
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping
    public List<User> getMatches(@RequestBody User user) {
        List<User> matches = userService.saveUserAndGenerateMatches(user);
        System.out.println(matches.toString());
        return matches;
    }/*
    @PostMapping
    public List<User> getMatchesById(@RequestParam String id) {
        List<User> matches = userService.saveUserAndGenerateMatches(userRepository.getUserById(Long.valueOf(id)));
        return matches;
    }*/
}
