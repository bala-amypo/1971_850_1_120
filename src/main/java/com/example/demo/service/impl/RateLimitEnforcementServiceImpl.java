package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RateLimitEnforcementServiceImpl implements RateLimitEnforcementService {
    private final RateLimitEnforcementRepository repo;
    public RateLimitEnforcementServiceImpl(RateLimitEnforcementRepository repo) { this.repo = repo; }
    public RateLimitEnforcement create(RateLimitEnforcement r) { return repo.save(r); }
    public List<RateLimitEnforcement> findAll() { return repo.findAll(); }
}
