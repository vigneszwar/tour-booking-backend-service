package model;

public class ComplementService {
    private final ComplementRepository complementRepository;

    @Autowired
    public ComplementService(ComplementRepository complementRepository) {
        this.complementRepository = complementRepository;
    }

    public List<Complement> getAllComplements() {
        return complementRepository.findAll();
    }

    public Complement saveComplement(Complement complement) {
        return complementRepository.save(complement);
    }
}
