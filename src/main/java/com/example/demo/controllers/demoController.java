package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.demoService;

@RestController
public class demoController {
	
	@Autowired
	private demoService service;
		
	@GetMapping("/")
	public List<?> getHolaMundo(@RequestParam String valor) {
		return Arrays.asList("hOLA", "mUNDO", "cHOMASO", valor, service.devolverNombre());
	}

}
