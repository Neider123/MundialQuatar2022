package com.mundial.demo.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
/*
@Entity
*/
@Table(name = "resultado")
public class Resultado {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	   /*
	   @JsonIgnore
		@OneToMany(mappedBy="seleccion_id")
		private List<Seleccion> selecciones;
	   
	   @JsonIgnore
		@OneToMany(mappedBy="partido_id")
		private List<Partido> partidos;
		*/
	private String goles;
	private String amarillas;
	private String rojas;

}
