package com.example.demo.dto;

import java.sql.Timestamp;

public class ApiKeyUsageSummaryDto {
    public Long id;
    public String keyValue;
    public Long ownerId;
    public Long planId;
    public Boolean active;
    public Timestamp createdAt;
    public Timestamp updatedAt;
}
