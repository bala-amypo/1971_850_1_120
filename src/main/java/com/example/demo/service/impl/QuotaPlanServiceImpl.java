package com.example.demo.service.impl;

import com.example.demo.entity.QuotaPlan;
import com.example.demo.repository.QuotaPlanRepository;
import com.example.demo.service.QuotaPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotaPlanServiceImpl implements QuotaPlanService {

    private final QuotaPlanRepository quotaPlanRepo;

    public QuotaPlanServiceImpl(QuotaPlanRepository quotaPlanRepo) {
        this.quotaPlanRepo = quotaPlanRepo;
    }

    @Override
    public List<QuotaPlan> findAll() {
        return quotaPlanRepo.findAll();
    }
}
