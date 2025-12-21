package com.example.demo.controller;

import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rate-limit-enforcements")
public class RateLimitEnforcementController {

    private final RateLimitEnforcementService rateLimitEnforcementService;

    public RateLimitEnforcementController(
            RateLimitEnforcementService rateLimitEnforcementService) {
        this.rateLimitEnforcementService = rateLimitEnforcementService;
    }

    @PostMapping
    public void enforceRateLimit(
            @RequestBody RateLimitEnforcement enforcement) {
        rateLimitEnforcementService.enforce(enforcement);
    }
}
