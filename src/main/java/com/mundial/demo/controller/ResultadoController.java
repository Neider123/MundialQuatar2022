package com.mundial.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mundial.demo.entities.Resultado;
import com.mundial.demo.entities.Seleccion;
import com.mundial.demo.repository.ResultadoRepository;
import com.mundial.demo.repository.SeleccionRepository;

@RestController
@RequestMapping("/resultados")
public class ResultadoController {
	
	/*
	@Autowired
	ResultadoRepository resultadoRepository;
	
	
	
	@GetMapping
	public List<Resultado> getSeleccionAll () {
		return resultadoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Resultado getSeleccionesbyId(@PathVariable Integer id) {
		
		Optional<Resultado> resultado = resultadoRepository.findById(id);
		if(resultado.isPresent()) {
			return resultado.get();
		}
		return null;
		
	}
	
	
	@PostMapping
	public Resultado postResultado(@RequestBody Resultado resultado) {
		
		resultadoRepository.save(resultado);
		
		return resultado;
		

	}
	
	*/

}
