package com.example.demo.service.impl;

import com.example.demo.entity.UsageLog;
import com.example.demo.repository.UsageLogRepository;
import com.example.demo.service.UsageLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsageLogServiceImpl implements UsageLogService {

    private final UsageLogRepository repository;

    public UsageLogServiceImpl(UsageLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public UsageLog save(UsageLog usageLog) {
        return repository.save(usageLog);
    }

    @Override
    public List<UsageLog> findAll() {
        return repository.findAll();
    }
}
