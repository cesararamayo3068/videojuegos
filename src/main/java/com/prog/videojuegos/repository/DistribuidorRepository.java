package com.prog.videojuegos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prog.videojuegos.domain.Distribuidor;
import com.prog.videojuegos.domain.Videojuego;

public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {

	
}
