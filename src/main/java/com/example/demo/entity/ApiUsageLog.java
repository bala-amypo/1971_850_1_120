package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "api_usage_log")
public class ApiUsageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ApiKey apiKey;

    private String endpoint;
    private LocalDateTime timestamp = LocalDateTime.now();

    public Long getId() { return id; }
    public ApiKey getApiKey() { return apiKey; }
    public String getEndpoint() { return endpoint; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setApiKey(ApiKey apiKey) { this.apiKey = apiKey; }
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }
}
