package com.example.demo.service.impl;

import com.example.demo.entity.KeyExemption;
import com.example.demo.repository.KeyExemptionRepository;
import com.example.demo.service.KeyExemptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyExemptionServiceImpl implements KeyExemptionService {

    private final KeyExemptionRepository keyExemptionRepository;

    public KeyExemptionServiceImpl(KeyExemptionRepository keyExemptionRepository) {
        this.keyExemptionRepository = keyExemptionRepository;
    }

    @Override
    public KeyExemption create(KeyExemption exemption) {
        return keyExemptionRepository.save(exemption);
    }

    @Override
    public List<KeyExemption> findAll() {
        return keyExemptionRepository.findAll();
    }
}
