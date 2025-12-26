import java.util.List;
import java.util.Optional;
import java.time.Instant;

public class KeyExemptionServiceImpl implements KeyExemptionService {

    private final KeyExemptionRepository repo;
    private final ApiKeyRepository apiKeyRepo;

    public KeyExemptionServiceImpl(KeyExemptionRepository repo, ApiKeyRepository apiKeyRepo) {
        this.repo = repo;
        this.apiKeyRepo = apiKeyRepo;
    }

    @Override
    public KeyExemption createExemption(KeyExemption e) {
        if (e.getTemporaryExtensionLimit() < 0)
            throw new BadRequestException("Invalid extension");

        if (e.getValidUntil().isBefore(Instant.now()))
            throw new BadRequestException("Invalid expiry");

        apiKeyRepo.findById(e.getApiKey().getId())
            .orElseThrow(() -> new ResourceNotFoundException("ApiKey not found"));

        return repo.save(e);
    }

    @Override
    public KeyExemption updateExemption(Long id, KeyExemption e) {
        KeyExemption existing = repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Exemption not found"));

        existing.setTemporaryExtensionLimit(e.getTemporaryExtensionLimit());
        existing.setValidUntil(e.getValidUntil());

        return repo.save(existing);
    }

    @Override
    public Optional<KeyExemption> getExemptionByKey(Long apiKeyId) {
        return repo.findByApiKey_Id(apiKeyId);
    }

    @Override
    public List<KeyExemption> getAllExemptions() {
        return repo.findAll();
    }
}
