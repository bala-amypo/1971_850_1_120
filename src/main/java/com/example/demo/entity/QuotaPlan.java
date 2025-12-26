package com.example.demo.entity;

public class QuotaPlan {

    private Long id;
    private String planName;
    private Integer dailyLimit;
    private Boolean active = true;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlanName() { return planName; }
    public void setPlanName(String planName) { this.planName = planName; }

    public Integer getDailyLimit() { return dailyLimit; }
    public void setDailyLimit(Integer dailyLimit) { this.dailyLimit = dailyLimit; }

    public Boolean isActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
