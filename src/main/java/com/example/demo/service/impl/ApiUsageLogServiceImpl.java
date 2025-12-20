package com.example.demo.service.impl;

import com.example.demo.entity.ApiKey;
import com.example.demo.entity.ApiUsageLog;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ApiKeyRepository;
import com.example.demo.repository.ApiUsageLogRepository;
import com.example.demo.service.ApiUsageLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    private final ApiUsageLogRepository logRepo;
    private final ApiKeyRepository apiKeyRepo;

    public ApiUsageLogServiceImpl(ApiUsageLogRepository logRepo,
                                  ApiKeyRepository apiKeyRepo) {
        this.logRepo = logRepo;
        this.apiKeyRepo = apiKeyRepo;
    }

    @Override
    public ApiUsageLog logUsage(ApiUsageLog log) {

        if (log.getTimestamp().isAfter(LocalDateTime.now())) {
            throw new BadRequestException("Timestamp cannot be in future");
        }

        ApiKey key = apiKeyRepo.findById(log.getApiKey().getId())
                .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        log.setApiKey(key);
        return logRepo.save(log);
    }

    @Override
    public List<ApiUsageLog> getUsageForApiKey(Long keyId) {
        return logRepo.findByApiKey_Id(keyId);
    }

    @Override
    public List<ApiUsageLog> getUsageForToday(Long keyId) {
        LocalDate today = LocalDate.now();
        return logRepo.findAll().stream()
                .filter(l -> l.getApiKey().getId().equals(keyId))
                .filter(l -> l.getTimestamp().toLocalDate().equals(today))
                .toList();
    }

    @Override
    public int countRequestsToday(Long keyId) {
        return getUsageForToday(keyId).size();
    }
}
