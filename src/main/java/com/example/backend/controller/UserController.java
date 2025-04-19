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
    /*
{
"id": 1,
"name": "Daniel Miller",
"age": 25,
"gender": "Male",
"description": "Hackathons has been my main interest, but recently I've started enjoying Cybersecurity too.",
"height": 170,
"race": null,
"religion": "Muslim",
"instagram": "https://instagram.com/daniel89",
"spotify": null,
"leetcode": "Contest rating=303",
"picture": "https://randomuser.me/api/portraits/men/44.jpg",
"interests": [
"Embedded Systems",
"Hardware"
],
"categories": [
"Dating",
"Friends"
]
}
    */
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
