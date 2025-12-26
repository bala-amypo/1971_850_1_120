package com.example.demo.service;

import com.example.demo.entity.ApiUsageLog;
import java.util.List;

public interface ApiUsageLogService {

    ApiUsageLog logUsage(Long apiKeyId);

    List<ApiUsageLog> getUsageByKey(Long apiKeyId);
}
