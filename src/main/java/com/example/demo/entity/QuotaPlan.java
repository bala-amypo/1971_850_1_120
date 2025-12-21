package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "quota_plan", uniqueConstraints = @UniqueConstraint(columnNames = "plan_name"))
public class QuotaPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plan_name", nullable = false, unique = true)
    private String planName;

    @Min(1)
    @Column(nullable = false)
    private Integer dailyLimit;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Boolean active = true;

    public QuotaPlan() {}

    // getters & setters
    public Long getId() { return id; }
    public String getPlanName() { return planName; }
    public Integer getDailyLimit() { return dailyLimit; }
    public Boolean getActive() { return active; }
    public void setPlanName(String planName) { this.planName = planName; }
    public void setDailyLimit(Integer dailyLimit) { this.dailyLimit = dailyLimit; }
    public void setActive(Boolean active) { this.active = active; }
}
