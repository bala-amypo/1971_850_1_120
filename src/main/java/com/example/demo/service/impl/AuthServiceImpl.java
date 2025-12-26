package com.example.demo.service.impl;

import com.example.demo.dto.*;
import com.example.demo.entity.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Map;

public class AuthServiceImpl implements AuthService {

    private final UserAccountRepository repo;
    private final PasswordEncoder encoder;
    private final AuthenticationManager manager;
    private final JwtUtil jwt;

    public AuthServiceImpl(UserAccountRepository r, PasswordEncoder e,
                           AuthenticationManager m, JwtUtil j) {
        this.repo = r; this.encoder = e; this.manager = m; this.jwt = j;
    }

    public void register(RegisterRequestDto dto) {
        if (repo.existsByEmail(dto.getEmail()))
            throw new BadRequestException("Duplicate email");

        UserAccount u = new UserAccount();
        u.setEmail(dto.getEmail());
        u.setPassword(encoder.encode(dto.getPassword()));
        u.setRole("ROLE_" + dto.getRole());

        repo.save(u);
    }

    public AuthResponseDto login(AuthRequestDto dto) {
        UserAccount user = repo.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid"));

        String token = jwt.generateToken(Map.of(), user.getEmail());
        return new AuthResponseDto(token);
    }
}
