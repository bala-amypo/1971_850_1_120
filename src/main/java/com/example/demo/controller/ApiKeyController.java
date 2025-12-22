package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/api-keys")
public class ApiKeyController {
    private final ApiKeyService s;
    public ApiKeyController(ApiKeyService s) { this.s = s; }
    @PostMapping public ApiKey create(@RequestBody ApiKey a) { return s.create(a); }
    @GetMapping public List<ApiKey> getAll() { return s.findAll(); }
}
