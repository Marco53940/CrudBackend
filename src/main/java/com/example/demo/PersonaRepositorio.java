
package com.example.demo;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface PersonaRepositorio extends Repository<Persona, Long> {
    List<Persona> findAll();
    Persona findOne(long id);
    Persona save(Persona p);
    void delete(Persona p);
}
