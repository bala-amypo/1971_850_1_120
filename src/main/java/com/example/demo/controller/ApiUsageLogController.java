package com.example.demo.controller;

import com.example.demo.entity.ApiUsageLog;
import com.example.demo.service.ApiUsageLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usage")
public class ApiUsageLogController {

    private final ApiUsageLogService service;

    public ApiUsageLogController(ApiUsageLogService service) {
        this.service = service;
    }

    @PostMapping
    public ApiUsageLog logUsage(@RequestBody ApiUsageLog log) {
        return service.logUsage(log);
    }

    @GetMapping("/today/{keyId}")
    public List<ApiUsageLog> getTodayUsage(@PathVariable Long keyId) {
        return service.getUsageForToday(keyId);
    }

    @GetMapping("/count/{keyId}")
    public int countToday(@PathVariable Long keyId) {
        return service.countRequestsToday(keyId);
    }
}
