package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ComplementController {
    private final ComplementService complementService;


    @Autowired
    public ComplementController(ComplementService complementService) {
        this.complementService = complementService;
    }

    @GetMapping
    public ResponseEntity<List<Complement>> getAllComplements() {
        List<Complement> complements = complementService.getAllComplements();
        return new ResponseEntity<>(complements, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Complement> addComplement(@RequestBody Complement complement) {
        Complement savedComplement = complementService.saveComplement(complement);
        return new ResponseEntity<>(savedComplement, HttpStatus.CREATED);
    }
}
