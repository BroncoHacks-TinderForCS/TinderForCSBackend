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
        jdbcTemplate.execute(
                "INSERT INTO users (id, name, email) VALUES ('1', 'John Doe', 'john.doe@example.com')");
        jdbcTemplate.execute(
                "INSERT INTO users (id, name, email) VALUES ('2', 'Jane Smith', 'jane.smith@example.com')");
        jdbcTemplate.execute(
                "INSERT INTO users (id, name, email) VALUES ('3', 'Robert Brown', 'robert.brown@example.com')");
        jdbcTemplate.execute(
                "INSERT INTO users (id, name, email) VALUES ('4', 'Emily Davis', 'emily.davis@example.com')");
        jdbcTemplate.execute(
                "INSERT INTO users (id, name, email) VALUES ('5', 'Michael Johnson', 'michael.johnson@example.com')");

    }

}