package com.example.demo.config;

import com.example.demo.repository.*;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyConfig {

    @Bean
    ApiKeyRepository apiKeyRepository() {
        return Mockito.mock(ApiKeyRepository.class);
    }

    @Bean
    QuotaPlanRepository quotaPlanRepository() {
        return Mockito.mock(QuotaPlanRepository.class);
    }

    @Bean
    ApiUsageLogRepository apiUsageLogRepository() {
        return Mockito.mock(ApiUsageLogRepository.class);
    }

    @Bean
    RateLimitEnforcementRepository rateLimitEnforcementRepository() {
        return Mockito.mock(RateLimitEnforcementRepository.class);
    }

    @Bean
    KeyExemptionRepository keyExemptionRepository() {
        return Mockito.mock(KeyExemptionRepository.class);
    }
}
