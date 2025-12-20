package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rate_limit_enforcements")
public class RateLimitEnforcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "api_key_id", nullable = false)
    private ApiKey apiKey;

    @Column(nullable = false)
    private LocalDateTime blockedAt;

    @Column(nullable = false)
    private Integer limitExceededBy;

    private String message;

    public RateLimitEnforcement() {}

    public RateLimitEnforcement(ApiKey apiKey, LocalDateTime blockedAt,
                                Integer limitExceededBy, String message) {
        this.apiKey = apiKey;
        this.blockedAt = blockedAt;
        this.limitExceededBy = limitExceededBy;
        this.message = message;
    }
}
