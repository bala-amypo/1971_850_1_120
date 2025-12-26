package com.example.demo.repository;

import com.example.demo.entity.ApiKey;

import java.util.List;
import java.util.Optional;
@Repository
public interface ApiKeyRepository {

    Optional<ApiKey> findById(Long id);

    List<ApiKey> findAll();

    ApiKey save(ApiKey apiKey);
}
