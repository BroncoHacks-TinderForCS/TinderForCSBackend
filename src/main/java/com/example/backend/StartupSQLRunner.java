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
        jdbcTemplate.execute("""
                             INSERT INTO user (id, name, age, gender, description, height, race, religion, instagram, spotify, leetcode, picture)
                             VALUES (36, 'Isla Anderson', 19, 'Female', 'I\\'m studying Gaming and would love to collaborate on anything related to AI.', 156, 'Mixed', 'Spiritual', NULL, 'https://spotify.com/user/isla979', NULL, 'https://randomuser.me/api/portraits/women/44.jpg');""");
        jdbcTemplate.execute("""
                             INSERT INTO user_interests (user_id, interests) VALUES (36, 'Gaming'), (36, 'Hackathons'), (36, 'Competitive Programming'), (36, 'Friends');""");
        jdbcTemplate.execute("""
                             INSERT INTO user (id, name, age, gender, description, height, race, religion, instagram, spotify, leetcode, picture)
                             VALUES (37, 'Alice Miller', 23, 'Female', 'I\\'m currently studying Gaming and love diving deep into Cybersecurity projects.', 155, 'Other', NULL, NULL, 'https://spotify.com/user/alice816', NULL, 'https://randomuser.me/api/portraits/women/19.jpg');""");
        jdbcTemplate.execute("""
        INSERT INTO user_interests (user_id, interests) VALUES (37, 'UI/UX'), 
                             (37, 'Mobile Apps'),(37, 'Dating'),(37, 'Friends');""");
    }

}