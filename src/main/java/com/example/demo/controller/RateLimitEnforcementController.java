@RestController
@RequestMapping("/api/rate-limit-enforcements")
public class RateLimitEnforcementController {

    private final RateLimitEnforcementService service;

    public RateLimitEnforcementController(RateLimitEnforcementService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody RateLimitEnforcement enforcement) {
        service.create(enforcement);
    }

    @GetMapping
    public List<RateLimitEnforcement> getAll() {
        return service.findAll();
    }
}
