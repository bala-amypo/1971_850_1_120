package com.example.demo.service;

import com.example.demo.entity.UsageLog;
import java.util.List;

public interface UsageLogService {
    UsageLog save(UsageLog usageLog);
    List<UsageLog> findAll();
}
