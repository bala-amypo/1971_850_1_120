import java.util.List;
import java.util.Optional;
import java.time.Instant;

public class ApiKeyServiceImpl implements ApiKeyService {

    private final ApiKeyRepository apiKeyRepo;
    private final QuotaPlanRepository quotaPlanRepo;

    public ApiKeyServiceImpl(ApiKeyRepository apiKeyRepo, QuotaPlanRepository quotaPlanRepo) {
        this.apiKeyRepo = apiKeyRepo;
        this.quotaPlanRepo = quotaPlanRepo;
    }

    @Override
    public ApiKey createApiKey(ApiKey key) {
        if (key.getQuotaPlan() == null)
            throw new BadRequestException("QuotaPlan required");
        return apiKeyRepo.save(key);
    }

    @Override
    public ApiKey updateApiKey(Long id, ApiKey key) {
        ApiKey existing = apiKeyRepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        existing.setActive(key.isActive());
        existing.setQuotaPlan(key.getQuotaPlan());
        return apiKeyRepo.save(existing);
    }

    @Override
    public ApiKey getApiKeyById(Long id) {
        return apiKeyRepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));
    }

    @Override
    public List<ApiKey> getAllApiKeys() {
        return apiKeyRepo.findAll();
    }

    @Override
    public void deactivateApiKey(Long id) {
        ApiKey key = getApiKeyById(id);
        key.setActive(false);
        apiKeyRepo.save(key);
    }
}
