package com.prog.videojuegos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.videojuegos.domain.Distribuidor;
import com.prog.videojuegos.repository.DistribuidorRepository;

@Service
public class DistribuidorService {
	// le inyectamos el DistribuidorRepository con la anotacion @Autowired
	@Autowired
	private DistribuidorRepository distribuidorRepository;

	public List<Distribuidor> buscarTodosLosDistribuidores() {
		return distribuidorRepository.findAll();
	}
}
