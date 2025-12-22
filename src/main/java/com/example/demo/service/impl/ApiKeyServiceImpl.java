package com.example.demo.service.impl;

import com.example.demo.entity.ApiKey;
import com.example.demo.entity.QuotaPlan;
import com.example.demo.repository.ApiKeyRepository;
import com.example.demo.repository.QuotaPlanRepository;
import com.example.demo.service.ApiKeyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    private final ApiKeyRepository apiKeyRepository;
    private final QuotaPlanRepository quotaPlanRepository;

    public ApiKeyServiceImpl(ApiKeyRepository apiKeyRepository,
                             QuotaPlanRepository quotaPlanRepository) {
        this.apiKeyRepository = apiKeyRepository;
        this.quotaPlanRepository = quotaPlanRepository;
    }

    @Override
    public ApiKey create(ApiKey apiKey) {
        if (apiKey.getQuotaPlan() != null && apiKey.getQuotaPlan().getId() != null) {
            QuotaPlan plan = quotaPlanRepository
                    .findById(apiKey.getQuotaPlan().getId())
                    .orElseThrow(() -> new RuntimeException("Quota plan not found"));
            apiKey.setQuotaPlan(plan);
        }
        return apiKeyRepository.save(apiKey);
    }

    @Override
    public List<ApiKey> findAll() {
        return apiKeyRepository.findAll();
    }
}
