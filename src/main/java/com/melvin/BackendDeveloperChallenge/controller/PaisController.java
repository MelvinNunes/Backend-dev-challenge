package com.melvin.BackendDeveloperChallenge.controller;

import com.melvin.BackendDeveloperChallenge.services.PaisService;
import com.melvin.BackendDeveloperChallenge.model.Pais;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {
    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pais>> getAll(){
        List <Pais> paises = paisService.getPaises();
        return  new ResponseEntity<>(paises, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Pais> getById(@PathVariable("id") Long id) throws Exception {
        Pais paisById = paisService.getContactById(id);
        return new ResponseEntity<>(paisById, HttpStatus.OK);
    }
    @GetMapping("/count")
    public ResponseEntity<Long> getTotal(){
        return new ResponseEntity<>(paisService.getTotalPaises(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Pais> add(@RequestBody Pais pais){
        if (!pais.getNome().isEmpty() && !pais.getCapital().isEmpty() && !pais.getRegiao().isEmpty() && !pais.getSubRegiao().isEmpty() && !pais.getArea().isEmpty()) {
            Pais paisCreated = paisService.createPais(pais);
            return new ResponseEntity<>(paisCreated, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update")
    public ResponseEntity<Pais> update(@RequestBody Pais pais){
        Pais paisUpdated = paisService.updatePais(pais);
        return new ResponseEntity<>(paisUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Pais> delete(@PathVariable("id") Long id){
        paisService.deletePais(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
