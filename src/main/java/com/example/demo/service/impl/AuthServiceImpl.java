package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequestDto;
import com.example.demo.dto.AuthResponseDto;
import com.example.demo.dto.RegisterRequestDto;
import com.example.demo.entity.UserAccount;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserAccountRepository userAccountRepository;
    private final JwtUtil jwtUtil;

    public AuthServiceImpl(UserAccountRepository userAccountRepository,
                           JwtUtil jwtUtil) {
        this.userAccountRepository = userAccountRepository;
        this.jwtUtil = jwtUtil;
    }
    


    @Override
    public void register(RegisterRequestDto dto) {
        UserAccount user = new UserAccount();
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        userAccountRepository.save(user);
    }

    @Override
    public AuthResponseDto login(AuthRequestDto dto) {
        UserAccount user = userAccountRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new BadRequestException("Invalid credentials"));

        if (!user.getPassword().equals(dto.getPassword())) {
            throw new BadRequestException("Invalid credentials");
        }

        return new AuthResponseDto(
                jwtUtil.generateToken(user),
                user.getRole(),
                user.getId()
        );
    }
}
