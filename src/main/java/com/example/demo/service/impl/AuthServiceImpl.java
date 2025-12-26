package com.example.demo.service.impl;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AuthRequestDto;
import com.example.demo.dto.AuthResponseDto;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.AuthService;
@Service
public class AuthServiceImpl implements AuthService {

    private final JwtUtil jwtUtil;

    public AuthServiceImpl(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public AuthResponseDto login(AuthRequestDto request) {
        String token = jwtUtil.generateToken(request.getUsername());
        return new AuthResponseDto(token, "Login successful");
    }

    @Override
    public AuthResponseDto register(AuthRequestDto request) {
        String token = jwtUtil.generateToken(request.getUsername());
        return new AuthResponseDto(token, "Registration successful");
    }
}
