package com.melvin.BackendDeveloperChallenge.services;

import com.melvin.BackendDeveloperChallenge.model.Pais;
import com.melvin.BackendDeveloperChallenge.repo.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaisService {
    private final PaisRepository paisRepository;

    @Autowired
    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    // Cria um país
    public Pais createPais(Pais pais){
        return paisRepository.save(pais);
    }
    // Atualiza/modifica um país
    public  Pais updatePais(Pais pais){
        return paisRepository.save(pais);
    }
    // Elimina um pais pelo id
    public void deletePais(Long id){
        paisRepository.deleteById(id);
    }
    // Lista todos os paises
    public List<Pais> getPaises(){
        return paisRepository.findAll();
    }
    // Procura um pais pelo ID
    public Pais getContactById(Long id) throws Exception {
        return paisRepository.findById(id).orElseThrow(()-> new Exception("Pais com "+id+" não foi encontrado!"));
    }
    // Ordena os paises por qualquer propriedade
    public List<Pais> getPaisesOrderedBy (String value){
        return paisRepository.findAll(Sort.by(Sort.Direction.ASC, value));
    }
    // Conta quantos países existem
    public Long getTotalPaises(){
        return paisRepository.count();
    }
}
