public interface KeyExemptionRepository {
    KeyExemption save(KeyExemption e);
    Optional<KeyExemption> findByApiKey_Id(Long id);
}
