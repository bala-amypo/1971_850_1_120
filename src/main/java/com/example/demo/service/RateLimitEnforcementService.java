package com.example.demo.service;

public interface RateLimitEnforcementService {
    boolean allowRequest(String apiKey);
}
