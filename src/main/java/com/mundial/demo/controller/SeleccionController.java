package com.mundial.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mundial.demo.entities.Seleccion;
import com.mundial.demo.repository.SeleccionRepository;



@RestController
@RequestMapping("/selecciones")
public class SeleccionController {
	
	@Autowired
	SeleccionRepository seleccionRepository;
	
	@GetMapping
	public List<Seleccion> getSeleccionAll () {
		return seleccionRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Seleccion getSeleccionesbyId(@PathVariable Integer id) {
		
		Optional<Seleccion> seleccion = seleccionRepository.findById(id);
		if(seleccion.isPresent()) {
			return seleccion.get();
		}
		return null;
		
	}
	
	
	@PostMapping
	public Seleccion postSeleccion(@RequestBody Seleccion seleccion) {
		
		seleccionRepository.save(seleccion);
		
		return seleccion;
		

	}
	
	

}
