package com.example.demo.entity;

import java.time.Instant;

public class RateLimitEnforcement {

    private Long id;
    private ApiKey apiKey;
    private Instant timestamp;

    public RateLimitEnforcement() {
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

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
