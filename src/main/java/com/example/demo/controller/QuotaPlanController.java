package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/quota-plans")
public class QuotaPlanController {
    private final QuotaPlanService s;
    public QuotaPlanController(QuotaPlanService s) { this.s = s; }
    @PostMapping public QuotaPlan create(@RequestBody QuotaPlan q) { return s.create(q); }
    @GetMapping public List<QuotaPlan> getAll() { return s.findAll(); }
}
