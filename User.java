package com.library.model;

import javax.persistence.*;

@Entity

@Table(name = "users")

public class User {

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;

private String username;

private String password;

private String role;

*// Getters and Setters*

}