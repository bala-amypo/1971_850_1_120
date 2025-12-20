
public interface RateLimitEnforcementRepository extends JpaRepository<RateLimitEnforcement, Long> {
    List<RateLimitEnforcement> findByApiKey_Id(Long id);
}