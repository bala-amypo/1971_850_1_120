package com.example.demo.service;

import com.example.demo.entity.RateLimitEnforcement;

public interface RateLimitEnforcementService {

    void enforce(RateLimitEnforcement enforcement);
}
