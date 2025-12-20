package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RateLimitEnforcement {

    @Id
    @GeneratedValue
    private Long id;

    private int limitExceededBy;

    private LocalDateTime timestamp;

    @ManyToOne
    private ApiKey apiKey;

    public Long getId() {
        return id;
    }

    public int getLimitExceededBy() {
        return limitExceededBy;
    }

    public void setLimitExceededBy(int limitExceededBy) {
        this.limitExceededBy = limitExceededBy;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public ApiKey getApiKey() {
        return apiKey;
    }

    public void setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
    }
}
