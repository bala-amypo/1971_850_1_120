package com.example.demo.repository;

import com.example.demo.entity.ApiKey;
import java.util.*;

public interface ApiKeyRepository {
    Optional<ApiKey> findById(Long id);
    List<ApiKey> findAll();
    ApiKey save(ApiKey key);
}
