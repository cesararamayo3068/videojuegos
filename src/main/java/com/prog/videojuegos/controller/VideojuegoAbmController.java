package com.prog.videojuegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prog.videojuegos.services.DistribuidorService;

@Controller
public class VideojuegoAbmController {
    //le inyectamos el service con la anotacion @Autowired
	@Autowired
	private DistribuidorService distribuidorService;
	
	@RequestMapping("/videojuegos/crear")
	public String mostrarFormAlta(Model model) {
		model.addAttribute("distribuidores", distribuidorService.buscarTodosLosDistribuidores());
		return "formVideojuego";
	}

}
