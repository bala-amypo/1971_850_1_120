package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "key_exemptions")
public class KeyExemption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "api_key_id", nullable = false)
    private ApiKey apiKey;

    private String notes;

    private Boolean unlimitedAccess = false;

    private Integer temporaryExtensionLimit;

    @Column(nullable = false)
    private LocalDateTime validUntil;

    public KeyExemption() {}

    public KeyExemption(ApiKey apiKey, String notes, Boolean unlimitedAccess,
                        Integer temporaryExtensionLimit, LocalDateTime validUntil) {
        this.apiKey = apiKey;
        this.notes = notes;
        this.unlimitedAccess = unlimitedAccess;
        this.temporaryExtensionLimit = temporaryExtensionLimit;
        this.validUntil = validUntil;
    }
}
