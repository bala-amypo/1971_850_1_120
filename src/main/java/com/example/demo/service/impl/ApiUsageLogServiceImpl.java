package com.example.demo.service.impl;

import com.example.demo.entity.ApiUsageLog;
import com.example.demo.repository.ApiUsageLogRepository;
import com.example.demo.service.ApiUsageLogService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    private final ApiUsageLogRepository apiUsageLogRepository;

    public ApiUsageLogServiceImpl(ApiUsageLogRepository apiUsageLogRepository) {
        this.apiUsageLogRepository = apiUsageLogRepository;
    }

    @Override
    public ApiUsageLog logUsage(ApiUsageLog log) {
        return apiUsageLogRepository.save(log);
    }

    @Override
    public List<ApiUsageLog> getUsageForToday(Long apiKeyId) {
        Instant now = Instant.now();
        return apiUsageLogRepository.findForKeyBetween(
                apiKeyId,
                now.minusSeconds(86400),
                now
        );
    }

    @Override
    public int countRequestsToday(Long apiKeyId) {
        Instant now = Instant.now();
        return apiUsageLogRepository.countForKeyBetween(
                apiKeyId,
                now.minusSeconds(86400),
                now
        );
    }
}
