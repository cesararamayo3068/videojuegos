package com.prog.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prog.videojuegos.domain.Videojuego;
import com.prog.videojuegos.services.VideojuegoService;

@Controller
public class ListadoController {
	public final VideojuegoService videojuegoService;

	// se hace la inyeccion de dependecia del service mediante un constructor
	public ListadoController(VideojuegoService videojuegoService) {
		this.videojuegoService = videojuegoService;
	}

	@RequestMapping("/")
	public String listarVideojuegos(Model model) {
		List<Videojuego> destacados = videojuegoService.buscarDestacados();
		model.addAttribute("videojuegos", destacados);
		return "listado";
	}

	@RequestMapping("/videojuegosPorDistribuidor")
	public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model) {
		List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
		model.addAttribute("videojuegos", juegos);
		return "listado";

	}
}
