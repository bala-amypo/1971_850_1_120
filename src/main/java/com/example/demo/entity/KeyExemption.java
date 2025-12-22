@Entity
public class KeyExemption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean unlimitedAccess;
    private LocalDateTime validUntil;

    @OneToOne
    private ApiKey apiKey;

    // getters & setters
}
