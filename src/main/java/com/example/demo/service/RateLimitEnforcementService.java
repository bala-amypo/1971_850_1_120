public interface RateLimitEnforcementService {
    RateLimitEnforcement create(RateLimitEnforcement r);
    List<RateLimitEnforcement> findAll();
}
