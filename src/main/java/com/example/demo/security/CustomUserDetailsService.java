package com.example.demo.security;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;

import java.util.Optional;

public class CustomUserDetailsService {

    private final UserAccountRepository userRepository;

    public CustomUserDetailsService(UserAccountRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserAccount> loadUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
