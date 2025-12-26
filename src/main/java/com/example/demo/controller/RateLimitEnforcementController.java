package com.example.demo.controller;

import com.example.demo.entity.RateLimitEnforcement;
import com.example.demo.service.RateLimitEnforcementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rate-limit-enforcements")
public class RateLimitEnforcementController {

    private final RateLimitEnforcementService service;

    public RateLimitEnforcementController(RateLimitEnforcementService service) {
        this.service = service;
    }

    @PostMapping("/{apiKeyId}")
    public RateLimitEnforcement enforce(@PathVariable Long apiKeyId) {
        return service.enforce(apiKeyId);
    }

    @GetMapping("/{apiKeyId}")
    public List<RateLimitEnforcement> getByApiKey(@PathVariable Long apiKeyId) {
        return service.getByApiKey(apiKeyId);
    }
}
