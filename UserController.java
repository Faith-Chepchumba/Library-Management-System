package com.library.controller;

import com.library.model.User;

import com.library.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/users")

public class UserController {

@Autowired

private UserService userService;

@PostMapping("/register")

public User registerUser(@RequestBody User user) {

return userService.registerUser(user);

}

}