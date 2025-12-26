import java.util.List;
import java.util.Optional;
import java.time.Instant;

public class RateLimitEnforcementServiceImpl implements RateLimitEnforcementService {

    private final RateLimitEnforcementRepository repo;
    private final ApiKeyRepository apiKeyRepo;

    public RateLimitEnforcementServiceImpl(
        RateLimitEnforcementRepository repo,
        ApiKeyRepository apiKeyRepo) {

        this.repo = repo;
        this.apiKeyRepo = apiKeyRepo;
    }

    @Override
    public RateLimitEnforcement enforce(Long apiKeyId) {
        ApiKey key = apiKeyRepo.findById(apiKeyId)
            .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        RateLimitEnforcement e = new RateLimitEnforcement();
        e.setApiKey(key);
        e.setTimestamp(Instant.now());

        return repo.save(e);
    }

    @Override
    public List<RateLimitEnforcement> getByApiKey(Long apiKeyId) {
        return repo.findByApiKey_Id(apiKeyId);
    }
}
