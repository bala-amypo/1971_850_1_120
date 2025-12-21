package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rate_limit_enforcement")
public class RateLimitEnforcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ApiKey apiKey;

    private String reason;
    private LocalDateTime blockedAt = LocalDateTime.now();

    public Long getId() { return id; }
    public ApiKey getApiKey() { return apiKey; }
    public String getReason() { return reason; }

    public void setApiKey(ApiKey apiKey) { this.apiKey = apiKey; }
    public void setReason(String reason) { this.reason = reason; }
}
