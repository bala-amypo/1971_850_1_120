package com.example.demo.service.impl;

import com.example.demo.service.ApiKeyService;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    @Override
    public boolean isValidKey(String apiKey) {
        return apiKey != null && !apiKey.isEmpty();
    }
}
