package com.example.demo.repository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.QuotaPlan;

import java.util.List;
import java.util.Optional;
@Repository
public interface QuotaPlanRepository {

    Optional<QuotaPlan> findById(Long id);

    List<QuotaPlan> findAll();

    QuotaPlan save(QuotaPlan quotaPlan);
}
