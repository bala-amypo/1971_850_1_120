package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.List;
import java.util.Optional;

public interface KeyExemptionService {
    KeyExemption create(KeyExemption e);
    List<KeyExemption> findAll();
}
