package com.example.backend.service;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.ResponseCreateParams;
import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
import com.openai.models.ChatModel;
import com.openai.models.responses.ResponseOutputMessage;


import me.vacuity.ai.sdk.gemini.*;
import me.vacuity.ai.sdk.gemini.Interceptor.*;
import me.vacuity.ai.sdk.gemini.api.*;
import me.vacuity.ai.sdk.gemini.entity.*;
import me.vacuity.ai.sdk.gemini.enums.*;
import me.vacuity.ai.sdk.gemini.error.*;
import me.vacuity.ai.sdk.gemini.request.*;
import me.vacuity.ai.sdk.gemini.response.*;
import me.vacuity.ai.sdk.gemini.service.*;

@Service
public class MatchService {
    @Autowired
    private UserRepository userRepository;
    private static final String OPEN_AI_API_KEY = "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";
    private static final String GEMINI_API_KEY = "AIzaSyAfBiw9nJ5khIjKct-s57HH68niAdBFpNQ";
    private static final boolean USING_CHATGPT=false;
    public List<User> generateMatches(User user) {
        List<User> users = userRepository.findAll();
        users.remove(user);
        final String PROMPT = "Given the following user profile:" +
                        user.toString() +
                        "return the profile ID that best matches it out of the following profiles:"+
                        users.toString()+
                        "Make sure that the best ID is either the only number in your response or the first number.";
        List<User> matches = new ArrayList<>();
        if (USING_CHATGPT) {
           OpenAIClient client = OpenAIOkHttpClient.builder()
            .fromEnv()
            .apiKey(OPEN_AI_API_KEY)
            .build();
           ResponseCreateParams params = ResponseCreateParams.builder()
                .input(PROMPT)
                .model(ChatModel.GPT_4_1_NANO).build();
              List<ResponseOutputMessage> messages = client.responses().create(params).output().stream()
                .flatMap(item -> item.message().stream()).collect(Collectors.toList());
        
            messages.stream().flatMap(message -> message.content().stream())
                    .flatMap(content -> content.outputText().stream())
                    .forEach(outputText -> matches.add(userRepository.getUserById(Long.valueOf(extractNumber(outputText.text())))));

        }
        else {
            GeminiClient client = new GeminiClient(GEMINI_API_KEY);
            List<ChatMessage> messages = new ArrayList<>();
            messages.add(new ChatMessage("user",PROMPT));
            ChatRequest request = ChatRequest.builder().model("gemini-2.0-flash").contents(messages).build();
            ChatResponse response = client.chat(request);
            System.out.println(response.toString());
            matches.add(userRepository.getUserById(Long.valueOf(extractNumber(response.toString()))));
        }
        return matches;
    }
    private String extractNumber(String string) {
        int idIndex=0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c))
                break;
            idIndex+=1;
        }
        string=string.substring(idIndex);
        idIndex=0;
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c))
                break;
            idIndex+=1;
        }
        string=string.substring(0,idIndex);
        return string.strip();
    }
}
