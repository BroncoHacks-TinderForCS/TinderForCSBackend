package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.responses.ResponseCreateParams;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
import com.openai.models.responses.ResponseOutputMessage;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MatchService {
    @Autowired
    private UserRepository userRepository;
    public List<User> generateMatches(User user) {
        OpenAIClient client = OpenAIOkHttpClient.builder()
            .fromEnv()
            .apiKey("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")
            .build();
        List<User> users = userRepository.findAll();
        System.out.println("All users:"+users.toString());
        ResponseCreateParams params = ResponseCreateParams.builder()
                .input("Given the following user profile:" +
                        user.toString() +
                        "return the profile ID that best matches it out of the following profiles:"+
                        users.toString())
                .model(ChatModel.GPT_4_1_MINI).build();
        List<ResponseOutputMessage> messages = client.responses().create(params).output().stream()
         .flatMap(item -> item.message().stream()).collect(Collectors.toList());
        List<User> matches = new ArrayList<>();
        messages.stream().flatMap(message -> message.content().stream())
                    .flatMap(content -> content.outputText().stream())
                    .forEach(outputText -> matches.add(userRepository.getUserById(Long.valueOf(outputText.text()))));
            
        
        return matches;
    }
}
