package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quota_plans", uniqueConstraints = @UniqueConstraint(columnNames = "planName"))
public class QuotaPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String planName;

    @Column(nullable = false)
    private Integer dailyLimit;

    private String description;

    @Column(nullable = false)
    private Boolean active = true;

    public QuotaPlan() {}

    public QuotaPlan(String planName, Integer dailyLimit, String description, Boolean active) {
        this.planName = planName;
        this.dailyLimit = dailyLimit;
        this.description = description;
        this.active = active;
    }

    // ✅ GETTERS
    public Long getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public Integer getDailyLimit() {
        return dailyLimit;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getActive() {
        return active;
    }

    // ✅ SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
