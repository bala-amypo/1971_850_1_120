package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

public class UserAccount {

    private Long id;
    private String email;
    private String password;
    private String role;
    private Set<QuotaPlan> quotaPlans = new HashSet<>();

    public UserAccount() {}

    public UserAccount(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<QuotaPlan> getQuotaPlans() {
        return quotaPlans;
    }

    public void setQuotaPlans(Set<QuotaPlan> quotaPlans) {
        this.quotaPlans = quotaPlans;
    }
}
