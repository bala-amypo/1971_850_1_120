package com.example.demo.repository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RateLimitEnforcement;

import java.util.List;
@Repository
public interface RateLimitEnforcementRepository {

    RateLimitEnforcement save(RateLimitEnforcement enforcement);

    List<RateLimitEnforcement> findByApiKey_Id(Long apiKeyId);
}
