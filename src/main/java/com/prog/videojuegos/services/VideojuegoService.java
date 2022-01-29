package com.prog.videojuegos.services;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Service;

import com.prog.videojuegos.domain.Videojuego;
import com.prog.videojuegos.repository.VideojuegoRepository;

@Service
public class VideojuegoService {
	private final VideojuegoRepository videojuegoRepository;

	public VideojuegoService(VideojuegoRepository videojuegoRepository) {
		
		this.videojuegoRepository = videojuegoRepository;
	}

	public List<Videojuego> buscarDestacados() {
		
		return videojuegoRepository.buscarTodos();
	}
}
