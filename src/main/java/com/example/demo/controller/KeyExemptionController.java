package com.example.demo.controller;

import com.example.demo.entity.KeyExemption;
import com.example.demo.service.KeyExemptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/key-exemptions")
public class KeyExemptionController {

    private final KeyExemptionService service;

    public KeyExemptionController(KeyExemptionService service) {
        this.service = service;
    }

    @PostMapping
    public KeyExemption create(@RequestBody KeyExemption exemption) {
        return service.createExemption(exemption);
    }

    @PutMapping("/{id}")
    public KeyExemption update(@PathVariable Long id,
                               @RequestBody KeyExemption exemption) {
        return service.updateExemption(id, exemption);
    }

    @GetMapping("/{apiKeyId}")
    public Optional<KeyExemption> getByApiKey(@PathVariable Long apiKeyId) {
        return service.getExemptionByKey(apiKeyId);
    }

    @GetMapping
    public List<KeyExemption> getAll() {
        return service.getAllExemptions();
    }
}
