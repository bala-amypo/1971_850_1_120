package com.example.demo.dto;

public class ApiKeyUsageSummaryDto {

    private Long apiKeyId;
    private Long dailyLimit;
    private Long requestsUsed;
    private Long remainingRequests;

    public ApiKeyUsageSummaryDto() {
    }

    public ApiKeyUsageSummaryDto(Long apiKeyId,
                                 Long dailyLimit,
                                 Long requestsUsed,
                                 Long remainingRequests) {
        this.apiKeyId = apiKeyId;
        this.dailyLimit = dailyLimit;
        this.requestsUsed = requestsUsed;
        this.remainingRequests = remainingRequests;
    }

    public Long getApiKeyId() {
        return apiKeyId;
    }

    public void setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    public Long getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Long dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Long getRequestsUsed() {
        return requestsUsed;
    }

    public void setRequestsUsed(Long requestsUsed) {
        this.requestsUsed = requestsUsed;
    }

    public Long getRemainingRequests() {
        return remainingRequests;
    }

    public void setRemainingRequests(Long remainingRequests) {
        this.remainingRequests = remainingRequests;
    }
}
