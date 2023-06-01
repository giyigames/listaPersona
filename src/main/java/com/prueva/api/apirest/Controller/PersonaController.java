package com.prueva.api.apirest.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueva.api.apirest.model.Persona;


@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> obtenerTodasLasPersonas() {
        return personaService.obtenerTodasLasPersonas();
    }

    @GetMapping("/api/personas/{id}")
    public Persona obtenerPersona(@PathVariable Integer id) {
        return personaService.obtenerPersona(id);
    }

    @PostMapping("/api/personas")
    public Persona crear(@RequestBody Persona persona) {
        return personaService.crearPersona(persona);
    }

    @PutMapping("/api/personas")
    public Persona actualizar(@PathVariable Integer id, @RequestBody Persona persona) {
        return personaService.actualizarPersona(id, persona);
    }

    @DeleteMapping("/api/personas/{id}")
    public void eliminar(@PathVariable Integer id) {
        personaService.eliminarPersona(id);
    }
}