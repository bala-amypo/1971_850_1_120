
public interface ApiUsageLogRepository extends JpaRepository<ApiUsageLog, Long> {
    List<ApiUsageLog> findByApiKey_Id(Long id);
}