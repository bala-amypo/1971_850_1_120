package com.example.demo.repository;

import com.example.demo.entity.KeyExemption;

import java.util.List;
import java.util.Optional;

public interface KeyExemptionRepository {

    KeyExemption save(KeyExemption exemption);

    Optional<KeyExemption> findById(Long id);

    Optional<KeyExemption> findByApiKey_Id(Long apiKeyId);

    List<KeyExemption> findAll();
}
