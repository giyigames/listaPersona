package com.prueva.api.apirest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueva.api.apirest.model.Persona;


@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.findAll();
    }

    public Persona obtenerPersona(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona actualizarPersona(Integer id, Persona persona) {
        persona.setId(id);
        return personaRepository.save(persona);
    }

    public void eliminarPersona(Integer id) {
        personaRepository.deleteById(id);
    }
}
