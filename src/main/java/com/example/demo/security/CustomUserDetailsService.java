package com.example.demo.security;

import com.example.demo.repository.UserAccountRepository;
import org.springframework.security.core.userdetails.*;
import com.example.demo.entity.UserAccount;

public class CustomUserDetailsService implements UserDetailsService {

    private final UserAccountRepository repo;

    public CustomUserDetailsService(UserAccountRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserAccount u = repo.findByEmail(username)
                .orElseThrow(() -> new RuntimeException("Not found"));

        return User.withUsername(u.getEmail())
                .password(u.getPassword())
                .roles(u.getRole().replace("ROLE_", ""))
                .build();
    }
}
