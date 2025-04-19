package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MatchService matchService;

    public List<User> saveUserAndGenerateMatches(User user) {
        userRepository.save(user);
        List<User> matches = matchService.generateMatches(user);
        return matches;
    }
}