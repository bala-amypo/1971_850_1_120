@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    private final ApiKeyRepository apiKeyRepo;
    private final QuotaPlanRepository planRepo;

    public ApiKeyServiceImpl(ApiKeyRepository apiKeyRepo,
                             QuotaPlanRepository planRepo) {
        this.apiKeyRepo = apiKeyRepo;
        this.planRepo = planRepo;
    }

    @Override
    public ApiKey createApiKey(ApiKey apiKey) {

        if (!apiKey.getPlan().getActive()) {
            throw new BadRequestException("Quota plan is inactive");
        }

        if (apiKeyRepo.findByKeyValue(apiKey.getKeyValue()).isPresent()) {
            throw new IllegalArgumentException("Duplicate API key");
        }

        return apiKeyRepo.save(apiKey);
    }

    @Override
    public ApiKey getApiKeyById(Long id) {
        return apiKeyRepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));
    }

    @Override
    public void deactivateApiKey(Long id) {
        ApiKey key = getApiKeyById(id);
        key.setActive(false);
        apiKeyRepo.save(key);
    }
}
