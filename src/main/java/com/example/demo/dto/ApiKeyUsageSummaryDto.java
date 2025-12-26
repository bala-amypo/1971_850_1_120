package com.example.demo.dto;

public class ApiKeyUsageSummaryDto {

    private Long apiKeyId;
    private Integer dailyLimit;
    private Integer usedRequests;
    private Integer remainingRequests;
    private Boolean limitExceeded;

    public ApiKeyUsageSummaryDto() {
    }

    public ApiKeyUsageSummaryDto(Long apiKeyId,
                                 Integer dailyLimit,
                                 Integer usedRequests,
                                 Integer remainingRequests,
                                 Boolean limitExceeded) {
        this.apiKeyId = apiKeyId;
        this.dailyLimit = dailyLimit;
        this.usedRequests = usedRequests;
        this.remainingRequests = remainingRequests;
        this.limitExceeded = limitExceeded;
    }

    public Long getApiKeyId() {
        return apiKeyId;
    }

    public void setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    public Integer getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Integer getUsedRequests() {
        return usedRequests;
    }

    public void setUsedRequests(Integer usedRequests) {
        this.usedRequests = usedRequests;
    }

    public Integer getRemainingRequests() {
        return remainingRequests;
    }

    public void setRemainingRequests(Integer remainingRequests) {
        this.remainingRequests = remainingRequests;
    }

    public Boolean getLimitExceeded() {
        return limitExceeded;
    }

    public void setLimitExceeded(Boolean limitExceeded) {
        this.limitExceeded = limitExceeded;
    }
}
