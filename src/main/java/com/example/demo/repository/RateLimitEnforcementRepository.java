package com.example.demo.repository;

import com.example.demo.entity.RateLimitEnforcement;

import java.util.List;

public interface RateLimitEnforcementRepository {

    RateLimitEnforcement save(RateLimitEnforcement enforcement);

    List<RateLimitEnforcement> findByApiKey_Id(Long apiKeyId);
}
