package com.example.demo.controller;

import com.example.demo.entity.ApiUsageLog;
import com.example.demo.service.ApiUsageLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usage-logs")
public class ApiUsageLogController {

    private final ApiUsageLogService service;

    public ApiUsageLogController(ApiUsageLogService service) {
        this.service = service;
    }

    @PostMapping("/{apiKeyId}")
    public ApiUsageLog logUsage(@PathVariable Long apiKeyId) {
        return service.logUsage(apiKeyId);
    }

    @GetMapping("/{apiKeyId}")
    public List<ApiUsageLog> getUsage(@PathVariable Long apiKeyId) {
        return service.getUsageByKey(apiKeyId);
    }
}
