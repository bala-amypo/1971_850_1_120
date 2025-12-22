package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApiUsageLogServiceImpl implements ApiUsageLogService {
    private final ApiUsageLogRepository repo;
    public ApiUsageLogServiceImpl(ApiUsageLogRepository repo) { this.repo = repo; }
    public ApiUsageLog create(ApiUsageLog l) { return repo.save(l); }
    public List<ApiUsageLog> findAll() { return repo.findAll(); }
}
