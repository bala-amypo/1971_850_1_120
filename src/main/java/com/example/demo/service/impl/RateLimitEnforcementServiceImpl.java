package com.example.demo.service.impl;

import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.stereotype.Service;

@Service
public class RateLimitEnforcementServiceImpl implements RateLimitEnforcementService {

    @Override
    public boolean allowRequest(String apiKey) {
        return true;
    }
}
