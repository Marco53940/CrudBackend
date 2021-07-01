
package com.example.demo;

import java.util.List;


public interface PersonaService {
   
    List<Persona> listar();
    Persona listarId(long id);
    Persona buscarPorDocumento(long numeroDocumento, String tipoDocumento);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(long id);
    
}
