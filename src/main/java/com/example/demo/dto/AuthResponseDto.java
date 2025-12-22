package com.example.demo.dto;

public class AuthResponseDto {

    private String token;

    // ✅ REQUIRED no-arg constructor
    public AuthResponseDto() {
    }

    // ✅ REQUIRED constructor with token
    public AuthResponseDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
