package com.prog.videojuegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prog.videojuegos.domain.Videojuego;
import com.prog.videojuegos.services.DistribuidorService;
import com.prog.videojuegos.services.VideojuegoService;

@Controller
public class VideojuegoAbmController {
	// le inyectamos el service con la anotacion @Autowired
	@Autowired
	private DistribuidorService distribuidorService;
	
	@Autowired
	private VideojuegoService videojuegoService;

	@RequestMapping("/videojuegos/crear")
	public String mostrarFormAlta(Model model) {
		model.addAttribute("distribuidores", distribuidorService.buscarTodosLosDistribuidores());
		model.addAttribute("videojuego", new Videojuego());
		return "formVideojuego";
	}

	@PostMapping("/videojuegos/guardar")
	public String guardar(Videojuego videojuego) {
		videojuegoService.guardar(videojuego);
		return "redirect:/";
	}

}
