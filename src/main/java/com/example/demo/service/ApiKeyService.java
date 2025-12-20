package com.example.demo.service;

import com.example.demo.entity.ApiKey;
import java.util.List;

public interface ApiKeyService {
    ApiKey create(ApiKey key);
    ApiKey update(Long id, ApiKey key);
    ApiKey getById(Long id);
    List<ApiKey> getAll();
    void deactivate(Long id);
}
