package com.example.demo.service.impl;

import com.example.demo.service.ApiUsageLogService;
import org.springframework.stereotype.Service;

@Service
public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    @Override
    public void logUsage(String apiKey) {
        // no-op for test
    }
}
