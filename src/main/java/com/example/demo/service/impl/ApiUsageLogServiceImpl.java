package com.example.demo.service.impl;

import com.example.demo.entity.ApiKey;
import com.example.demo.entity.ApiUsageLog;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ApiKeyRepository;
import com.example.demo.repository.ApiUsageLogRepository;
import com.example.demo.service.ApiUsageLogService;

import java.time.Instant;
import java.util.List;

public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    private final ApiUsageLogRepository usageLogRepository;
    private final ApiKeyRepository apiKeyRepository;

    public ApiUsageLogServiceImpl(ApiUsageLogRepository usageLogRepository,
                                  ApiKeyRepository apiKeyRepository) {
        this.usageLogRepository = usageLogRepository;
        this.apiKeyRepository = apiKeyRepository;
    }

    @Override
    public ApiUsageLog logUsage(Long apiKeyId) {
        ApiKey key = apiKeyRepository.findById(apiKeyId)
                .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        ApiUsageLog log = new ApiUsageLog();
        log.setApiKey(key);
        log.setTimestamp(Instant.now());

        return usageLogRepository.save(log);
    }

    @Override
    public List<ApiUsageLog> getUsageByKey(Long apiKeyId) {
        return usageLogRepository.findByApiKey_Id(apiKeyId);
    }
}
