package com.example.demo.controller;

import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rate-limit-enforcements")
public class RateLimitEnforcementController {

    private final RateLimitEnforcementService rateLimitEnforcementService;

    public RateLimitEnforcementController(RateLimitEnforcementService rateLimitEnforcementService) {
        this.rateLimitEnforcementService = rateLimitEnforcementService;
    }

    @PostMapping
    public void createRateLimit(@RequestBody RateLimitEnforcement enforcement) {
        rateLimitEnforcementService.create(enforcement);
    }

    @GetMapping
    public List<RateLimitEnforcement> getAllRateLimitEnforcements() {
        return rateLimitEnforcementService.findAll();
    }
}
