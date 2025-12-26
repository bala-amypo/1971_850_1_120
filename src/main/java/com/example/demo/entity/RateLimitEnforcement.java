package com.example.demo.entity;

public class RateLimitEnforcement {

    private Long id;
    private ApiKey apiKey;
    private Integer limitExceededBy;

    public ApiKey getApiKey() { return apiKey; }
    public void setApiKey(ApiKey apiKey) { this.apiKey = apiKey; }

    public Integer getLimitExceededBy() { return limitExceededBy; }
    public void setLimitExceededBy(Integer limitExceededBy) { this.limitExceededBy = limitExceededBy; }
}
