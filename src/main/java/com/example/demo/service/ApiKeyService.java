package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.List;
import java.util.Optional;

public interface ApiKeyService {
    ApiKey create(ApiKey a);
    List<ApiKey> findAll();
}
