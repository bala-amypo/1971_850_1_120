package com.example.demo.repository;

import com.example.demo.entity.QuotaPlan;
import java.util.List;
import java.util.Optional;

public interface QuotaPlanRepository {
    Optional<QuotaPlan> findById(Long id);
    List<QuotaPlan> findAll();
    QuotaPlan save(QuotaPlan p);
}
