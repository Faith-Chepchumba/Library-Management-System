package com.library.service;

import com.library.model.User;

import com.library.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class UserService {

@Autowired

private UserRepository userRepository;

public User registerUser(User user) {

return userRepository.save(user);

}

public User findUserByUsername(String username) {

return userRepository.findByUsername(username);

}

}