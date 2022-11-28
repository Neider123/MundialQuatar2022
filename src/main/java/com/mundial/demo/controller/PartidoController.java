package com.mundial.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mundial.demo.entities.Partido;
import com.mundial.demo.entities.Seleccion;
import com.mundial.demo.repository.PartidoRepository;
import com.mundial.demo.repository.SeleccionRepository;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
	
	@Autowired
	PartidoRepository partidoRepository;
	
	@GetMapping
	public List<Partido> getPartidosAll () {
		return partidoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Partido getPartidosbyId(@PathVariable Integer id) {
		
		Optional<Partido> partido = partidoRepository.findById(id);
		if(partido.isPresent()) {
			return partido.get();
		}
		return null;
		

}
	
	
}