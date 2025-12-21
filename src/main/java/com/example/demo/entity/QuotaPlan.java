package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quota_plan")
public class QuotaPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plan_name", nullable = false)
    private String planName;

    @Column(name = "daily_limit", nullable = false)
    private Integer dailyLimit;

    @Column(nullable = false)
    private Boolean active;

    // ----- Constructors -----

    public QuotaPlan() {
    }

    public QuotaPlan(String planName, Integer dailyLimit, Boolean active) {
        this.planName = planName;
        this.dailyLimit = dailyLimit;
        this.active = active;
    }

    // ----- Getters & Setters -----

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
