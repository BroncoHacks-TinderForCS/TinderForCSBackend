package com.example.backend;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StartupSQLRunner {

    private final JdbcTemplate jdbcTemplate;

    public StartupSQLRunner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runSQLQueries() {
        // Insert 5 users
        
        jdbcTemplate.execute("""
                             INSERT INTO user (id, name, age, gender, description, height, race, religion, instagram, spotify, leetcode, picture)
                             VALUES (1, 'Daniel Miller', 25, 'Male', 'Hackathons has been my main interest, but recently I''ve started enjoying Cybersecurity too.', 170, NULL, 'Muslim', 'https://instagram.com/daniel89', NULL, NULL, 'https://randomuser.me/api/portraits/men/44.jpg');""");
        jdbcTemplate.execute("INSERT INTO user_interests (user_id, interests) VALUES (1, 'Embedded Systems');");
        jdbcTemplate.execute("""
                             insert into user (id,name,age,gender,description,height,race,religion,instagram,spotify,leetcode,picture)
                             values (42,'Ella Jones',22,'Female','Personally, I love UI/UX, but I also picked up an interest in backends ;)',160,null,null,null,null,null,null);""");

    }

}