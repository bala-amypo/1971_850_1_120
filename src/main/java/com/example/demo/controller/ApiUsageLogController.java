package com.example.demo.controller;

import com.example.demo.entity.UsageLog;
import com.example.demo.service.UsageLogService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usage-logs")
public class UsageLogController {

    private final UsageLogService usageLogService;

    public UsageLogController(UsageLogService usageLogService) {
        this.usageLogService = usageLogService;
    }

    // ✅ POST – Create usage log
    @PostMapping
    public ResponseEntity<UsageLog> createUsageLog(
            @Valid @RequestBody UsageLog usageLog) {
        return ResponseEntity.ok(usageLogService.save(usageLog));
    }

    // ✅ GET – Fetch all usage logs
    @GetMapping
    public ResponseEntity<List<UsageLog>> getAllUsageLogs() {
        return ResponseEntity.ok(usageLogService.findAll());
    }
}
