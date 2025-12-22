package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuotaPlanServiceImpl implements QuotaPlanService {
    private final QuotaPlanRepository repo;
    public QuotaPlanServiceImpl(QuotaPlanRepository repo) { this.repo = repo; }
    public QuotaPlan create(QuotaPlan q) { return repo.save(q); }
    public List<QuotaPlan> findAll() { return repo.findAll(); }
}
