package com.example.demo.service;

import com.example.demo.entity.ApiKey;
import java.util.List;

public interface ApiKeyService {

    ApiKey create(ApiKey apiKey);

    List<ApiKey> findAll();
}
