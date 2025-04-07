package com.libraryManagement.repository;

import com.libraryManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
        User findByUsername(String username);


}

