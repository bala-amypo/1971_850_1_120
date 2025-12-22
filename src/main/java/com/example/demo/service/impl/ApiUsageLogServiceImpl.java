@Service
public class ApiUsageLogServiceImpl implements ApiUsageLogService {

    private final ApiUsageLogRepository repository;

    public ApiUsageLogServiceImpl(ApiUsageLogRepository repository) {
        this.repository = repository;
    }

    public ApiUsageLog create(ApiUsageLog log) {
        return repository.save(log);
    }

    public List<ApiUsageLog> findAll() {
        return repository.findAll();
    }
}
