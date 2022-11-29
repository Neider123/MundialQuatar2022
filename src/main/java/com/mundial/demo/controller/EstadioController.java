package com.mundial.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mundial.demo.entities.Estadio;
import com.mundial.demo.entities.Seleccion;
import com.mundial.demo.repository.EstadioRepository;
import com.mundial.demo.repository.SeleccionRepository;

@RestController
@RequestMapping("/estadio")
public class EstadioController  {
  
	
	@Autowired
	EstadioRepository estadioRepository;
	
	@GetMapping
	public List<Estadio> getEstadioAll () {
		return estadioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Estadio getSeleccionesbyId(@PathVariable Integer id) {
		
		Optional<Estadio> estadio = estadioRepository.findById(id);
		if(estadio.isPresent()) {
			return estadio.get();
		}
		return null;
		
	}
	
	
	@PostMapping
	public Estadio postEstadio(@RequestBody Estadio estadio) {
		
		estadioRepository.save(estadio);
		
		return estadio;
		

	}
	
	@DeleteMapping("/{id}")
	public Estadio deleteEstadiosbyId(@PathVariable Integer id) {
		
		Optional<Estadio> estadio = estadioRepository.findById(id);
		
		if (estadio.isPresent()) {
			
			 Estadio estadioReturn = estadio.get();
			
			estadioRepository.deleteById(id);
			
			return estadioReturn;
		}
		
		return null;

	}
	
}
