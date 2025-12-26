package com.example.demo.repository;

import com.example.demo.entity.ApiUsageLog;

import java.util.List;
@Repository
public interface ApiUsageLogRepository {

    ApiUsageLog save(ApiUsageLog log);

    List<ApiUsageLog> findByApiKey_Id(Long apiKeyId);
}
