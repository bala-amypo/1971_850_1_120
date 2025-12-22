package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public class KeyExemption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ApiKey apiKey;

    private Boolean unlimitedAccess;
    private LocalDateTime validUntil;

    public Long getId() { return id; }
    public ApiKey getApiKey() { return apiKey; }
    public void setApiKey(ApiKey apiKey) { this.apiKey = apiKey; }
    public Boolean getUnlimitedAccess() { return unlimitedAccess; }
    public void setUnlimitedAccess(Boolean unlimitedAccess) { this.unlimitedAccess = unlimitedAccess; }
    public LocalDateTime getValidUntil() { return validUntil; }
    public void setValidUntil(LocalDateTime validUntil) { this.validUntil = validUntil; }
}
