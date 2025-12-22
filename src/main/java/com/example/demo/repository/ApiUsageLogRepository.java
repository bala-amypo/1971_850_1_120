package com.example.demo.repository;

import com.example.demo.entity.UsageLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageLogRepository extends JpaRepository<UsageLog, Long> {
}
