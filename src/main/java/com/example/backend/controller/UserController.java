package com.example.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.entity.User;
import com.example.backend.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        List<User> matches = userService.saveUserAndGenerateMatches(user);
        return ResponseEntity.ok(Map.of(
                "message", "User saved and matches generated successfully",
                "matches", matches));
    }
}
