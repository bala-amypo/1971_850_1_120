
package com.example.demo.service.impl;

import com.example.demo.entity.ApiKey;
import com.example.demo.entity.QuotaPlan;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import com.example.demo.service.ApiKeyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    private final ApiKeyRepository apiKeyRepo;
    private final QuotaPlanRepository planRepo;

    public ApiKeyServiceImpl(ApiKeyRepository apiKeyRepo, QuotaPlanRepository planRepo) {
        this.apiKeyRepo = apiKeyRepo;
        this.planRepo = planRepo;
    }

    public ApiKey create(ApiKey key) {
        QuotaPlan plan = planRepo.findById(key.getPlan().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Plan not found"));

        if (!plan.getActive())
            throw new BadRequestException("Plan is inactive");

        return apiKeyRepo.save(key);
    }

    public ApiKey update(Long id, ApiKey key) {
        ApiKey existing = getById(id);
        existing.setOwnerId(key.getOwnerId());
        existing.setPlan(key.getPlan());
        return apiKeyRepo.save(existing);
    }

    public ApiKey getById(Long id) {
        return apiKeyRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));
    }

    public List<ApiKey> getAll() {
        return apiKeyRepo.findAll();
    }

    public void deactivate(Long id) {
        ApiKey key = getById(id);
        key.setActive(false);
        apiKeyRepo.save(key);
    }
}
