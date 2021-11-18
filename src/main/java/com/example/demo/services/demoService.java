package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.demoRepository;

@Service
public class demoService {
	
	@Autowired
	private demoRepository repository;
	
	public String devolverNombre() {		
		return "nombre gabriel";
	}

}
