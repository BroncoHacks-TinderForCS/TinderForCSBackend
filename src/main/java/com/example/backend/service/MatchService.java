package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
import java.util.*;

@Service
public class MatchService {

    public List<User> generateMatches(User user) {
        ResponseCreateParams params = ResponseCreateParams.builder()
                .input("Given the following user profile:" +
                        user.toString() +
                        "return the profile ID that best matches it out of the following profiles:")
                .model(ChatModel.GPT_4_1).build();
        // Response response = client.responses().create(params);
        // String id = response.asString();
        List<User> matches = new ArrayList<>();
        // matches.add(UserRepository.getUserByID(id));
        return matches;
    }
}
