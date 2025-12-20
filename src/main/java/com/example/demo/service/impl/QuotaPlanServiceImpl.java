package com.example.demo.service.impl;

import com.example.demo.entity.QuotaPlan;
import com.example.demo.exception.*;
import com.example.demo.repository.QuotaPlanRepository;
import com.example.demo.service.QuotaPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotaPlanServiceImpl implements QuotaPlanService {

    private final QuotaPlanRepository repo;

    public QuotaPlanServiceImpl(QuotaPlanRepository repo) {
        this.repo = repo;
    }

    public QuotaPlan create(QuotaPlan plan) {
        if (plan.getDailyLimit() <= 0)
            throw new BadRequestException("Daily limit must be > 0");
        return repo.save(plan);
    }

    public QuotaPlan update(Long id, QuotaPlan plan) {
        QuotaPlan existing = getById(id);
        existing.setPlanName(plan.getPlanName());
        existing.setDailyLimit(plan.getDailyLimit());
        existing.setDescription(plan.getDescription());
        return repo.save(existing);
    }

    public QuotaPlan getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));
    }

    public List<QuotaPlan> getAll() {
        return repo.findAll();
    }

    public void deactivate(Long id) {
        QuotaPlan plan = getById(id);
        plan.setActive(false);
        repo.save(plan);
    }
}
