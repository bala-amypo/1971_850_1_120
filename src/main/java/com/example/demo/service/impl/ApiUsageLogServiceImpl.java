public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    private final ApiUsageLogRepository usageRepo;
    private final ApiKeyRepository apiKeyRepo;

    public ApiUsageLogServiceImpl(ApiUsageLogRepository usageRepo, ApiKeyRepository apiKeyRepo) {
        this.usageRepo = usageRepo;
        this.apiKeyRepo = apiKeyRepo;
    }

    @Override
    public ApiUsageLog logUsage(Long apiKeyId) {
        ApiKey key = apiKeyRepo.findById(apiKeyId)
            .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        ApiUsageLog log = new ApiUsageLog();
        log.setApiKey(key);
        log.setTimestamp(Instant.now());

        return usageRepo.save(log);
    }

    @Override
    public List<ApiUsageLog> getUsageByKey(Long apiKeyId) {
        return usageRepo.findByApiKey_Id(apiKeyId);
    }
}
