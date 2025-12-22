package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RateLimitEnforcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reason;

    @ManyToOne
    private ApiKey apiKey;

    public Long getId() { return id; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public ApiKey getApiKey() { return apiKey; }
    public void setApiKey(ApiKey apiKey) { this.apiKey = apiKey; }
}
