package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quota_plan")
public class QuotaPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;
    private Integer dailyLimit;
    private Boolean active = true;

    public Long getId() { return id; }
    public String getPlanName() { return planName; }
    public Integer getDailyLimit() { return dailyLimit; }
    public Boolean getActive() { return active; }

    public void setPlanName(String planName) { this.planName = planName; }
    public void setDailyLimit(Integer dailyLimit) { this.dailyLimit = dailyLimit; }
    public void setActive(Boolean active) { this.active = active; }
}
