package com.mundial.demo.entities;

import java.util.List;

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
@Table(name="partido")
public class Partido {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   /*
   @JoinColumn(name ="partido_id")
   */
   private Integer id;
   private String fecha;
  
  
   
}
