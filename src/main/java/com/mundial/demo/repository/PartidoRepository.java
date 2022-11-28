package com.mundial.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundial.demo.entities.Partido;


public interface PartidoRepository extends JpaRepository <Partido , Integer> {

}
