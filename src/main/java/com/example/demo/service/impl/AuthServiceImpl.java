package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequestDto;
import com.example.demo.dto.AuthResponseDto;
import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserAccountRepository userAccountRepository;
    private final JwtUtil jwtUtil;

    @Autowired
    public AuthServiceImpl(UserAccountRepository userAccountRepository, JwtUtil jwtUtil) {
        this.userAccountRepository = userAccountRepository;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public AuthResponseDto login(AuthRequestDto request) {
        // Find user by email
        Optional<UserAccount> userOpt = userAccountRepository.findByEmail(request.getEmail());
        if (userOpt.isEmpty()) {
            throw new RuntimeException("Invalid email or password");
        }

        UserAccount user = userOpt.get();

        // Check password
        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        // Generate JWT token using the user's email (or username)
        String token = jwtUtil.generateToken(user.getEmail());

        return new AuthResponseDto(token);
    }
}
