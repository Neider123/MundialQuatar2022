package com.mundial.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="partido")
public class Partido {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
   private String fecha;
   
}
