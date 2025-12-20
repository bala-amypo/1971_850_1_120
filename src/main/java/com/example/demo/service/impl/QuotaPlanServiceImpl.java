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

    private final QuotaPlanRepository planRepo;

    public QuotaPlanServiceImpl(QuotaPlanRepository planRepo) {
        this.planRepo = planRepo;
    }

    @Override
    public QuotaPlan createQuotaPlan(QuotaPlan plan) {

        if (plan.getDailyLimit() <= 0) {
            throw new BadRequestException("Daily limit must be greater than 0");
        }

        if (planRepo.findByPlanName(plan.getPlanName()).isPresent()) {
            throw new IllegalArgumentException("Duplicate plan name");
        }

        return planRepo.save(plan);
    }

    @Override
    public QuotaPlan updateQuotaPlan(Long id, QuotaPlan plan) {

        QuotaPlan existing = getQuotaPlanById(id);

        if (plan.getDailyLimit() <= 0) {
            throw new BadRequestException("Daily limit must be greater than 0");
        }

        existing.setPlanName(plan.getPlanName());
        existing.setDailyLimit(plan.getDailyLimit());
        existing.setDescription(plan.getDescription());

        return planRepo.save(existing);
    }

    @Override
    public QuotaPlan getQuotaPlanById(Long id) {
        return planRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));
    }

    @Override
    public List<QuotaPlan> getAllPlans() {
        return planRepo.findAll();
    }

    @Override
    public void deactivateQuotaPlan(Long id) {
        QuotaPlan plan = getQuotaPlanById(id);
        plan.setActive(false);
        planRepo.save(plan);
    }
}
