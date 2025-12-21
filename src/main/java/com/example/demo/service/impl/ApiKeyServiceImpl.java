package com.example.demo.service.impl;

import com.example.demo.entity.ApiKey;
import com.example.demo.repository.ApiKeyRepository;
import com.example.demo.service.ApiKeyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    private final ApiKeyRepository apiKeyRepo;

    public ApiKeyServiceImpl(ApiKeyRepository apiKeyRepo) {
        this.apiKeyRepo = apiKeyRepo;
    }

    @Override
    public ApiKey create(ApiKey apiKey) {
        return apiKeyRepo.save(apiKey);
    }

    @Override
    public List<ApiKey> findAll() {
        return apiKeyRepo.findAll();
    }
}
