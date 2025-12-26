package com.example.demo.service.impl;

import com.example.demo.entity.ApiKey;
import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ApiKeyRepository;
import com.example.demo.repository.RateLimitEnforcementRepository;
import com.example.demo.service.RateLimitEnforcementService;

import java.time.Instant;
import java.util.List;

public class RateLimitEnforcementServiceImpl implements RateLimitEnforcementService {

    private final RateLimitEnforcementRepository enforcementRepository;
    private final ApiKeyRepository apiKeyRepository;

    public RateLimitEnforcementServiceImpl(RateLimitEnforcementRepository enforcementRepository,
                                           ApiKeyRepository apiKeyRepository) {
        this.enforcementRepository = enforcementRepository;
        this.apiKeyRepository = apiKeyRepository;
    }

    @Override
    public RateLimitEnforcement enforce(Long apiKeyId) {
        ApiKey key = apiKeyRepository.findById(apiKeyId)
                .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        RateLimitEnforcement enforcement = new RateLimitEnforcement();
        enforcement.setApiKey(key);
        enforcement.setTimestamp(Instant.now());

        return enforcementRepository.save(enforcement);
    }

    @Override
    public List<RateLimitEnforcement> getByApiKey(Long apiKeyId) {
        return enforcementRepository.findByApiKey_Id(apiKeyId);
    }
}
