package com.prueva.api.apirest.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueva.api.apirest.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	
}