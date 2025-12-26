package com.example.demo.entity;

public class ApiKey {

    private Long id;
    private boolean active = true;
    private QuotaPlan quotaPlan;

    public ApiKey() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public QuotaPlan getQuotaPlan() {
        return quotaPlan;
    }

    public void setQuotaPlan(QuotaPlan quotaPlan) {
        this.quotaPlan = quotaPlan;
    }
}
