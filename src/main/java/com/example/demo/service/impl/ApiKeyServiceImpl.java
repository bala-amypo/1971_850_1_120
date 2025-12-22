package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {
    private final ApiKeyRepository repo;
    private final QuotaPlanRepository planRepo;

    public ApiKeyServiceImpl(ApiKeyRepository repo, QuotaPlanRepository planRepo) {
        this.repo = repo;
        this.planRepo = planRepo;
    }

    public ApiKey create(ApiKey a) {
        a.setQuotaPlan(planRepo.findById(a.getQuotaPlan().getId()).orElseThrow());
        return repo.save(a);
    }

    public List<ApiKey> findAll() { return repo.findAll(); }
}
