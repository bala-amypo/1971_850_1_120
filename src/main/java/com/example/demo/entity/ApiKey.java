package com.example.demo.entity;

import java.time.Instant;

public class ApiKey {

    private Long id;
    private String keyValue;
    private Long ownerId;
    private QuotaPlan plan;
    private Boolean active = true;
    private Instant createdAt;
    private Instant updatedAt;

    public ApiKey() {}

    public ApiKey(String keyValue, Long ownerId, QuotaPlan plan, Boolean active) {
        this.keyValue = keyValue;
        this.ownerId = ownerId;
        this.plan = plan;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public QuotaPlan getPlan() {
        return plan;
    }

    public void setPlan(QuotaPlan plan) {
        this.plan = plan;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
