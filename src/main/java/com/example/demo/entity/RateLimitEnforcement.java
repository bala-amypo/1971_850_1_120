package com.example.demo.entity;

import java.time.Instant;

public class RateLimitEnforcement {

    private Long id;
    private ApiKey apiKey;
    private Instant blockedAt;
    private Integer limitExceededBy;
    private String message;

    public RateLimitEnforcement() {}

    public RateLimitEnforcement(ApiKey apiKey, Instant blockedAt, Integer limitExceededBy, String message) {
        this.apiKey = apiKey;
        this.blockedAt = blockedAt;
        this.limitExceededBy = limitExceededBy;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApiKey getApiKey() {
        return apiKey;
    }

    public void setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
    }

    public Instant getBlockedAt() {
        return blockedAt;
    }

    public void setBlockedAt(Instant blockedAt) {
        this.blockedAt = blockedAt;
    }

    public Integer getLimitExceededBy() {
        return limitExceededBy;
    }

    public void setLimitExceededBy(Integer limitExceededBy) {
        this.limitExceededBy = limitExceededBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
