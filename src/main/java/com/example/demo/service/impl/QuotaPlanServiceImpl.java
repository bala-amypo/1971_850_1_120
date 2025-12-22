package com.example.demo.service.impl;

import com.example.demo.entity.QuotaPlan;
import com.example.demo.repository.QuotaPlanRepository;
import com.example.demo.service.QuotaPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotaPlanServiceImpl implements QuotaPlanService {

    private final QuotaPlanRepository repository;

    public QuotaPlanServiceImpl(QuotaPlanRepository repository) {
        this.repository = repository;
    }

    @Override
    public QuotaPlan create(QuotaPlan quotaPlan) {
        return repository.save(quotaPlan);
    }

    @Override
    public List<QuotaPlan> findAll() {
        return repository.findAll();
    }
}
