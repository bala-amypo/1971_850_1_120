package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KeyExemptionServiceImpl implements KeyExemptionService {
    private final KeyExemptionRepository repo;
    public KeyExemptionServiceImpl(KeyExemptionRepository repo) { this.repo = repo; }
    public KeyExemption create(KeyExemption e) { return repo.save(e); }
    public List<KeyExemption> findAll() { return repo.findAll(); }
}
