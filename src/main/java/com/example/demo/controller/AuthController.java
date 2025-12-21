package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService s) {
        this.service = s;
    }

    @PostMapping("/register")
    public AuthResponseDto register(@RequestBody RegisterRequestDto r) {
        return service.register(r);
    }

    @PostMapping("/login")
    public AuthResponseDto login(@RequestBody AuthRequestDto r) {
        return service.login(r);
    }
}
