package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import java.sql.Timestamp;

@Entity
@Table(name = "rate_limit_enforcement")
public class RateLimitEnforcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "api_key_id", nullable = false)
    private ApiKey apiKey;

    @Column(nullable = false)
    private Timestamp blockedAt;

    @Min(1)
    @Column(nullable = false)
    private Integer limitExceededBy;

    @Column(columnDefinition = "TEXT")
    private String message;

    public RateLimitEnforcement() {}
}
