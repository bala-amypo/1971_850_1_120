package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rate-limit-enforcements")
public class RateLimitEnforcementController {
    private final RateLimitEnforcementService s;
    public RateLimitEnforcementController(RateLimitEnforcementService s) { this.s = s; }
    @PostMapping public void create(@RequestBody RateLimitEnforcement r) { s.create(r); }
    @GetMapping public List<RateLimitEnforcement> getAll() { return s.findAll(); }
}
