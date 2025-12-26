public interface ApiKeyRepository {
    Optional<ApiKey> findById(Long id);
    Optional<ApiKey> findByKeyValue(String value);
    List<ApiKey> findAll();
    ApiKey save(ApiKey k);
}
