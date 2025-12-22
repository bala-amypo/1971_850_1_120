package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usage-logs")
public class ApiUsageLogController {
    private final ApiUsageLogService s;
    public ApiUsageLogController(ApiUsageLogService s) { this.s = s; }
    @PostMapping public void create(@RequestBody ApiUsageLog l) { s.create(l); }
    @GetMapping public List<ApiUsageLog> getAll() { return s.findAll(); }
}
