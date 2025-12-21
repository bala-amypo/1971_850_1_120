package com.example.demo.service;

import com.example.demo.dto.AuthRequestDto;
import com.example.demo.dto.RegistrationRequestDto;
import com.example.demo.entity.UserAccount;

public interface AuthService {

    UserAccount register(RegistrationRequestDto request);

    UserAccount login(AuthRequestDto request);
}
