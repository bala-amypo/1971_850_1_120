package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class QuotaPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;
    private Integer dailyLimit;
    private Boolean active;

    // getters & setters
}
