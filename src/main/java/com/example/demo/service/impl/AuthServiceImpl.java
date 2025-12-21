package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserAccountRepository userRepo;

    public AuthServiceImpl(UserAccountRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserAccount register(String email, String password, String role) {
        UserAccount user = new UserAccount();
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);
        return userRepo.save(user);
    }
}
