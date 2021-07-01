
package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


public interface PersonaRepositorio extends Repository<Persona, Long> {
    List<Persona> findAll();
   @Query("SELECT p FROM Persona p WHERE p.numeroDocumento=:numeroDocumento"
       +" AND p.tipoDocumento=:tipoDocumento")
    Persona findByDocumento(@Param("numeroDocumento") long numeroDocumento, @Param("tipoDocumento") String tipoDocumento);
    Persona findOne(long id);
    Persona save(Persona p);
    void delete(Persona p);
}
