@RestController
@RequestMapping("/api/key-exemptions")
public class KeyExemptionController {

    private final KeyExemptionService service;

    public KeyExemptionController(KeyExemptionService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody KeyExemption exemption) {
        service.create(exemption);
    }

    @GetMapping
    public List<KeyExemption> getAll() {
        return service.findAll();
    }
}
