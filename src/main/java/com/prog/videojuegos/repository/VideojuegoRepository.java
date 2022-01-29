package com.prog.videojuegos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prog.videojuegos.domain.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {

	@Query("from Videojuego v order by v.nombre")
	List<Videojuego> buscarTodos();
}
