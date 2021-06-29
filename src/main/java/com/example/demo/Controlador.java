package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {

    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona> listar() {
        return service.listar();
    }

    @PostMapping
    public Persona agregar(@RequestBody Persona p) {
        return service.add(p);
    }

    @GetMapping(path = {"/{id}"})
    public Persona listarId(@PathVariable("id") long id) {
        return service.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Persona editar(@RequestBody Persona p, @PathVariable("id") long id) {
        p.setIdPersona(id);
        return service.edit(p);
    }

    @DeleteMapping(path = {"/{id}"})
    public Persona delete(@PathVariable("id") long id) {
        return service.delete(id);
    }

}
