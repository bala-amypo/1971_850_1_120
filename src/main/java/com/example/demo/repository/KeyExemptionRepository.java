
public interface KeyExemptionRepository extends JpaRepository<KeyExemption, Long> {
    Optional<KeyExemption> findByApiKey_Id(Long id);
}
