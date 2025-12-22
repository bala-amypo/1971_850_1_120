package com.example.demo.controller;

import com.example.demo.entity.ApiKey;
import com.example.demo.service.ApiKeyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/api-keys")
public class ApiKeyController {

    private final ApiKeyService service;

    public ApiKeyController(ApiKeyService service) {
        this.service = service;
    }

    @PostMapping
    public ApiKey create(@RequestBody ApiKey apiKey) {
        return service.create(apiKey);
    }

    @GetMapping
    public List<ApiKey> getAll() {
        return service.findAll();
    }
}
