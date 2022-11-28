package com.mundial.demo.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


/*
@Data
@Entity
@Table(name ="resultado")
*/
public class Resultado {
	
	/*
	@Id
	@SequenceGenerator(name="Resultado_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="resultado_id_seq")
	private Integer id;
	@Column(name="partido_id")
	private Partido partido;
	@Column(name="seleccion_id")
	private Seleccion seleccion;
	private String goles;
	private String amarillas;
	private String rojas;
	*/
	
	

}
