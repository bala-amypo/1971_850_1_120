package com.example.demo.entity;

public class QuotaPlan {

    private Long id;
    private String planName;
    private Integer dailyLimit;
    private String description;
    private Boolean active = true;

    public QuotaPlan() {}

    public QuotaPlan(String planName, Integer dailyLimit, String description, Boolean active) {
        this.planName = planName;
        this.dailyLimit = dailyLimit;
        this.description = description;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Integer getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
