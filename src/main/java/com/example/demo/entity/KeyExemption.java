package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "key_exemption")
public class KeyExemption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ApiKey apiKey;

    private Boolean unlimitedAccess = false;
    private LocalDateTime validUntil;

    public Long getId() { return id; }
    public ApiKey getApiKey() { return apiKey; }
    public Boolean getUnlimitedAccess() { return unlimitedAccess; }
    public LocalDateTime getValidUntil() { return validUntil; }

    public void setApiKey(ApiKey apiKey) { this.apiKey = apiKey; }
    public void setUnlimitedAccess(Boolean unlimitedAccess) {
        this.unlimitedAccess = unlimitedAccess;
    }
    public void setValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
    }
}
