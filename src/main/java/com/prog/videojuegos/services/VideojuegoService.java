package com.prog.videojuegos.services;

import java.util.List;

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

	public List<Videojuego> buscarPorDistribuidor(int distribuidorId) {
		return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
	}
	
	public List<Videojuego> buscar(String consulta){
		return videojuegoRepository.buscar(consulta);
	}
}
