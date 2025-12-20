package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;
    private String role;

    public UserAccount() {}

    public UserAccount(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
