package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.List;
import java.util.Optional;

public interface QuotaPlanService {
    QuotaPlan create(QuotaPlan q);
    List<QuotaPlan> findAll();
}
