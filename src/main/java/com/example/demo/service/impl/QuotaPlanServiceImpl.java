package com.example.demo.service.impl;

import com.example.demo.service.QuotaPlanService;
import org.springframework.stereotype.Service;

@Service
public class QuotaPlanServiceImpl implements QuotaPlanService {

    @Override
    public int getQuotaForKey(String apiKey) {
        return 100;
    }
}
