package com.example.demo.service.impl;

import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.repository.RateLimitEnforcementRepository;
import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateLimitEnforcementServiceImpl
        implements RateLimitEnforcementService {

    private final RateLimitEnforcementRepository rateLimitRepository;

    public RateLimitEnforcementServiceImpl(
            RateLimitEnforcementRepository rateLimitRepository) {
        this.rateLimitRepository = rateLimitRepository;
    }

    @Override
    public RateLimitEnforcement create(RateLimitEnforcement enforcement) {
        return rateLimitRepository.save(enforcement);
    }

    @Override
    public List<RateLimitEnforcement> findAll() {
        return rateLimitRepository.findAll();
    }
}
