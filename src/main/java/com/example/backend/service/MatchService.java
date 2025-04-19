package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.User;

@Service
public class MatchService {

    @Autowired
    private MatchService matchService;

    public List<User> generateMatches(User user) {
        return matchService.generateMatches(user);
    }
}
