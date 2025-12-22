package com.example.demo.repository;

import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface KeyExemptionRepository
        extends JpaRepository<KeyExemption, Long> {
    Optional<KeyExemption> findByApiKey_Id(Long apiKeyId);
}

