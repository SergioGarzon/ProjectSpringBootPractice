package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Persona;

public interface demoRepository extends CrudRepository<Persona, Long> {

	
	
}
