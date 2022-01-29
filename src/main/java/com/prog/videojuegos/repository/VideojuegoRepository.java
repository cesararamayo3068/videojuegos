package com.prog.videojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.videojuegos.domain.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
	

}
