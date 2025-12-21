package com.example.demo.service.impl;

import com.example.demo.entity.KeyExemption;
import com.example.demo.repository.KeyExemptionRepository;
import com.example.demo.service.KeyExemptionService;
import org.springframework.stereotype.Service;

@Service
public class KeyExemptionServiceImpl implements KeyExemptionService {

    private final KeyExemptionRepository repo;

    public KeyExemptionServiceImpl(KeyExemptionRepository repo) {
        this.repo = repo;
    }

    @Override
    public void save(KeyExemption exemption) {
        repo.save(exemption);
    }
}
