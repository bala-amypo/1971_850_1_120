package com.example.demo.repository;

import com.example.demo.entity.ApiKey;
import java.util.List;
import java.util.Optional;

public interface ApiKeyRepository {
    Optional<ApiKey> findById(Long id);
    Optional<ApiKey> findByKeyValue(String value);
    List<ApiKey> findAll();
    ApiKey save(ApiKey k);
}
