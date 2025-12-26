package com.example.demo.service.impl;

import com.example.demo.dto.AuthResponseDto;
import com.example.demo.dto.RegisterRequestDto;
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
    public AuthResponseDto register(RegisterRequestDto request) {
        UserAccount user = new UserAccount();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword()); // TODO: encode password
        user.setRole(request.getRole());

        user = userAccountRepository.save(user);

        String token = jwtUtil.generateToken(user.getEmail()); // Pass email or ID

        return new AuthResponseDto(token, user.getEmail(), user.getId());
    }

    @Override
    public AuthResponseDto login(String email, String password) {
        Optional<UserAccount> optionalUser = userAccountRepository.findByEmail(email);
        if (optionalUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        UserAccount user = optionalUser.get();

        if (!user.getPassword().equals(password)) { // TODO: use password encoder
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(user.getEmail());

        return new AuthResponseDto(token, user.getEmail(), user.getId());
    }
}
