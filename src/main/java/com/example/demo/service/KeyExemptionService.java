package com.example.demo.service;

import com.example.demo.entity.KeyExemption;
import java.util.List;

public interface KeyExemptionService {

    KeyExemption create(KeyExemption exemption);

    List<KeyExemption> findAll();
}
