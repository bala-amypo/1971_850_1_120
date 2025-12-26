import java.util.List;
import java.util.Optional;
import java.time.Instant;

public class QuotaPlanServiceImpl implements QuotaPlanService {

    private final QuotaPlanRepository repo;

    public QuotaPlanServiceImpl(QuotaPlanRepository repo) {
        this.repo = repo;
    }

    @Override
    public QuotaPlan createQuotaPlan(QuotaPlan plan) {
        if (plan.getDailyLimit() <= 0)
            throw new BadRequestException("Daily limit must be > 0");
        return repo.save(plan);
    }

    @Override
    public QuotaPlan updateQuotaPlan(Long id, QuotaPlan plan) {
        QuotaPlan existing = repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));

        if (plan.getDailyLimit() <= 0)
            throw new BadRequestException("Invalid daily limit");

        existing.setPlanName(plan.getPlanName());
        existing.setDailyLimit(plan.getDailyLimit());
        existing.setActive(plan.isActive());

        return repo.save(existing);
    }

    @Override
    public QuotaPlan getQuotaPlanById(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("QuotaPlan not found"));
    }

    @Override
    public List<QuotaPlan> getAllPlans() {
        return repo.findAll();
    }
}
