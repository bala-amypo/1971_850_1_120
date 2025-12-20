package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ApiUsageLog {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime timestamp;

    @ManyToOne
    private ApiKey apiKey;

    public Long getId() {
        return id;
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
