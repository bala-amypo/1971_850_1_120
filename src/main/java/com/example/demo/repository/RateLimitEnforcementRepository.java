public interface RateLimitEnforcementRepository {
    RateLimitEnforcement save(RateLimitEnforcement e);
    Optional<RateLimitEnforcement> findById(Long id);
    List<RateLimitEnforcement> findByApiKey_Id(Long id);
}
