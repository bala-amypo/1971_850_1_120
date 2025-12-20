

public interface QuotaPlanRepository extends JpaRepository<QuotaPlan, Long> {
    Optional<QuotaPlan> findByPlanName(String planName);
}
