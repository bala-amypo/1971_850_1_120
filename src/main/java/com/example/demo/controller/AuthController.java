package com.example.demo.controller;

import com.example.demo.dto.AuthRequestDto;
import com.example.demo.dto.AuthResponseDto;
import com.example.demo.dto.RegisterRequestDto;
import com.example.demo.entity.UserAccount;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;
    private final JwtUtil jwtUtil;

    public AuthController(AuthService authService, JwtUtil jwtUtil) {
        this.authService = authService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public AuthResponseDto register(
            @RequestBody RegisterRequestDto request) {

        UserAccount user = authService.register(request);

        AuthResponseDto response = new AuthResponseDto();
        response.setUserId(user.getId());
        response.setEmail(user.getEmail());
        response.setRole(user.getRole());
        response.setToken(jwtUtil.generateToken(user.getEmail()));

        return response;
    }

    @PostMapping("/login")
    public AuthResponseDto login(
            @RequestBody AuthRequestDto request) {

        UserAccount user = authService.login(request);

        AuthResponseDto response = new AuthResponseDto();
        response.setUserId(user.getId());
        response.setEmail(user.getEmail());
        response.setRole(user.getRole());
        response.setToken(jwtUtil.generateToken(user.getEmail()));

        return response;
    }
}
