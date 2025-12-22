public interface RateLimitEnforcementService {
    RateLimitEnforcement create(RateLimitEnforcement enforcement);
    List<RateLimitEnforcement> findAll();
}
