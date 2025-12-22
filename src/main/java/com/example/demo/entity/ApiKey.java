package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyValue;
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "quota_plan_id")
    private QuotaPlan quotaPlan;

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    
    public QuotaPlan getQuotaPlan() {
        return quotaPlan;
    }

    public void setQuotaPlan(QuotaPlan quotaPlan) {
        this.quotaPlan = quotaPlan;
    }
}
