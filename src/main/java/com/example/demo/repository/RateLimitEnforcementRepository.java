package com.example.demo.repository;

import com.example.demo.entity.RateLimitEnforcement;

public interface RateLimitEnforcementRepository {

    RateLimitEnforcement save(RateLimitEnforcement enforcement);
}
