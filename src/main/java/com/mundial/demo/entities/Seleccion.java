package com.mundial.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="seleccion")
public class Seleccion {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinColumn(name = "partido_id")
	private Integer id;
	private String nombre;
	private String grupo;
	    /*
	    @ManyToOne
	    @JoinColumn(name ="continente_id")
	    private Continente continente;
	    */
	
	
	

}
