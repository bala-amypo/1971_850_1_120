package com.example.demo.service.impl;

import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.repository.RateLimitEnforcementRepository;
import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.stereotype.Service;

@Service
public class RateLimitEnforcementServiceImpl
        implements RateLimitEnforcementService {

    private final RateLimitEnforcementRepository repo;

    public RateLimitEnforcementServiceImpl(
            RateLimitEnforcementRepository repo) {
        this.repo = repo;
    }

    @Override
    public void enforce(RateLimitEnforcement enforcement) {
        repo.save(enforcement);
    }
}
