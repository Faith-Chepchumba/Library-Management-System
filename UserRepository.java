package com.library.repository;

import com.library.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

User findByUsername(String username);

}