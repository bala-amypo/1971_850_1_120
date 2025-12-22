package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/key-exemptions")
public class KeyExemptionController {
    private final KeyExemptionService s;
    public KeyExemptionController(KeyExemptionService s) { this.s = s; }
    @PostMapping public void create(@RequestBody KeyExemption e) { s.create(e); }
    @GetMapping public List<KeyExemption> getAll() { return s.findAll(); }
}
