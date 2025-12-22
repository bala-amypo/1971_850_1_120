package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.List;
import java.util.Optional;

public interface RateLimitEnforcementService {
    RateLimitEnforcement create(RateLimitEnforcement r);
    List<RateLimitEnforcement> findAll();
}
