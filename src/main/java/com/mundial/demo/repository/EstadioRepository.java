package com.mundial.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundial.demo.entities.Estadio;
import com.mundial.demo.entities.Resultado;

public interface EstadioRepository extends JpaRepository <Estadio , Integer> {

}
