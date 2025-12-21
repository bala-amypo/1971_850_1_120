package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "api_key")
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String keyValue;

    @ManyToOne
    @JoinColumn(name = "quota_plan_id")
    private QuotaPlan quotaPlan;

    private Boolean active = true;

    public Long getId() { return id; }
    public String getKeyValue() { return keyValue; }
    public QuotaPlan getQuotaPlan() { return quotaPlan; }
    public Boolean getActive() { return active; }

    public void setKeyValue(String keyValue) { this.keyValue = keyValue; }
    public void setQuotaPlan(QuotaPlan quotaPlan) { this.quotaPlan = quotaPlan; }
    public void setActive(Boolean active) { this.active = active; }
}
