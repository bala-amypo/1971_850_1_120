package com.example.demo.controller;

import com.example.demo.entity.KeyExemption;
import com.example.demo.service.KeyExemptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/key-exemptions")
public class KeyExemptionController {

    private final KeyExemptionService keyExemptionService;

    public KeyExemptionController(KeyExemptionService keyExemptionService) {
        this.keyExemptionService = keyExemptionService;
    }

    @PostMapping
    public void createExemption(@RequestBody KeyExemption exemption) {
        keyExemptionService.save(exemption);
    }
}
