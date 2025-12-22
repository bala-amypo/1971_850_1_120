package com.example.demo.service;

import com.example.demo.entity.RateLimitEnforcement;
import java.util.List;

public interface RateLimitEnforcementService {

    RateLimitEnforcement create(RateLimitEnforcement enforcement);

    List<RateLimitEnforcement> findAll();
}
