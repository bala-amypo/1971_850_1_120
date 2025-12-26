package com.example.demo.service.impl;

import com.example.demo.service.KeyExemptionService;
import org.springframework.stereotype.Service;

@Service
public class KeyExemptionServiceImpl implements KeyExemptionService {

    @Override
    public boolean isExempted(String apiKey) {
        return false;
    }
}
