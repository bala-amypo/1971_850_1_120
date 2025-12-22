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

    // getters & setters
}
