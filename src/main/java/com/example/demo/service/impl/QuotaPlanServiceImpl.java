package com.example.demo.service.impl;

import com.example.demo.entity.QuotaPlan;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.QuotaPlanRepository;
import com.example.demo.service.QuotaPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotaPlanServiceImpl implements QuotaPlanService {

    private final QuotaPlanRepository quotaPlanRepository;

    public QuotaPlanServiceImpl(QuotaPlanRepository quotaPlanRepository) {
        this.quotaPlanRepository = quotaPlanRepository;
    }

    // CREATE
    @Override
    public QuotaPlan createQuotaPlan(QuotaPlan plan) {

        if (plan.getDailyLimit() <= 0) {
            throw new BadRequestException("Daily limit must be greater than 0");
        }

        if (quotaPlanRepository.findByPlanName(plan.getPlanName()).isPresent()) {
            throw new BadRequestException("Quota plan already exists");
        }

        return quotaPlanRepository.save(plan);
    }

    // UPDATE
    @Override
    public QuotaPlan updateQuotaPlan(Long id, QuotaPlan plan) {

        QuotaPlan existing = quotaPlanRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));

        if (plan.getDailyLimit() <= 0) {
            throw new BadRequestException("Daily limit must be greater than 0");
        }

        existing.setPlanName(plan.getPlanName());
        existing.setDailyLimit(plan.getDailyLimit());
        existing.setDescription(plan.getDescription());

        return quotaPlanRepository.save(existing);
    }

    // READ (BY ID)
    @Override
    public QuotaPlan getQuotaPlanById(Long id) {
        return quotaPlanRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));
    }

    // READ (ALL)
    @Override
    public List<QuotaPlan> getAllPlans() {
        return quotaPlanRepository.findAll();
    }

    // DELETE (SOFT DELETE)
    @Override
    public void deactivateQuotaPlan(Long id) {
        QuotaPlan plan = quotaPlanRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));

        plan.setActive(false);
        quotaPlanRepository.save(plan);
    }
}
