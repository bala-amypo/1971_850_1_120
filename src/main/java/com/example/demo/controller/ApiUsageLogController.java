@RestController
@RequestMapping("/api/usage-logs")
public class ApiUsageLogController {

    private final ApiUsageLogService service;

    public ApiUsageLogController(ApiUsageLogService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody ApiUsageLog log) {
        service.create(log);
    }

    @GetMapping
    public List<ApiUsageLog> getAll() {
        return service.findAll();
    }
}
