package com.example.demo.service.impl;

import com.example.demo.entity.ApiUsageLog;
import com.example.demo.repository.ApiUsageLogRepository;
import com.example.demo.service.ApiUsageLogService;
import org.springframework.stereotype.Service;

@Service
public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    private final ApiUsageLogRepository apiUsageLogRepo;

    public ApiUsageLogServiceImpl(ApiUsageLogRepository apiUsageLogRepo) {
        this.apiUsageLogRepo = apiUsageLogRepo;
    }

    @Override
    public void log(ApiUsageLog apiUsageLog) {
        apiUsageLogRepo.save(apiUsageLog);
    }
}
