package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.List;
import java.util.Optional;

public interface ApiUsageLogService {
    ApiUsageLog create(ApiUsageLog l);
    List<ApiUsageLog> findAll();
}
