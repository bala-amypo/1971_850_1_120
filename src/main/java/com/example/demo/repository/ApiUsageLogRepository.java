package com.example.demo.repository;

import com.example.demo.entity.ApiUsageLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Instant;
import java.util.List;

public interface ApiUsageLogRepository extends JpaRepository<ApiUsageLog, Long> {

    @Query("""
        SELECT l FROM ApiUsageLog l
        WHERE l.apiKey.id = :apiKeyId
        AND l.timestamp BETWEEN :start AND :end
    """)
    List<ApiUsageLog> findForKeyBetween(
            @Param("apiKeyId") Long apiKeyId,
            @Param("start") Instant start,
            @Param("end") Instant end
    );

    @Query("""
        SELECT COUNT(l) FROM ApiUsageLog l
        WHERE l.apiKey.id = :apiKeyId
        AND l.timestamp BETWEEN :start AND :end
    """)
    long countForKeyBetween(
            @Param("apiKeyId") Long apiKeyId,
            @Param("start") Instant start,
            @Param("end") Instant end
    );
}
