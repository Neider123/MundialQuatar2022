package com.mundial.demo.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name ="continente")
public class Continente {
	
	/*
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	@JsonIgnore
	@OneToMany(mappedBy = "continente_id")
	private List<Seleccion> selecciones;
	
	private String nombre;
	*/
	

}
