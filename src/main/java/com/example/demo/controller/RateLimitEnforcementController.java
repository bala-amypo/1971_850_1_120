package com.example.demo.controller;

import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rate-limits")
public class RateLimitEnforcementController {

    private final RateLimitEnforcementService service;

    public RateLimitEnforcementController(RateLimitEnforcementService service) {
        this.service = service;
    }

    @PostMapping
    public RateLimitEnforcement create(@RequestBody RateLimitEnforcement enforcement) {
        return service.createEnforcement(enforcement);
    }
}
