package com.example.demo.repository;

import com.example.demo.entity.ApiUsageLog;

import java.time.Instant;
import java.util.List;

public interface ApiUsageLogRepository {

    ApiUsageLog save(ApiUsageLog log);

    List<ApiUsageLog> findForKeyBetween(Long apiKeyId, Instant start, Instant end);

    int countForKeyBetween(Long apiKeyId, Instant start, Instant end);
}
