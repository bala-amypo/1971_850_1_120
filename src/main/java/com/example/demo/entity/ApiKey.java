package com.example.demo.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "api_key")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "key_value", nullable = false, unique = true)
    private String keyValue;

    // IMPORTANT: EAGER fetch to avoid null fields in response
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quota_plan_id", nullable = false)
    private QuotaPlan quotaPlan;

    @Column(nullable = false)
    private Boolean active = true;

    // ===== Constructors =====

    public ApiKey() {}

    public ApiKey(String keyValue, QuotaPlan quotaPlan, Boolean active) {
        this.keyValue = keyValue;
        this.quotaPlan = quotaPlan;
        this.active = active;
    }

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public QuotaPlan getQuotaPlan() {
        return quotaPlan;
    }

    public void setQuotaPlan(QuotaPlan quotaPlan) {
        this.quotaPlan = quotaPlan;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
