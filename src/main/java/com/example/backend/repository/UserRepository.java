package com.example.backend.repository;

import com.example.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // Custom query to find a user by email
    User getUserById(Long id);

    // List<User> getAllUsers();
}
