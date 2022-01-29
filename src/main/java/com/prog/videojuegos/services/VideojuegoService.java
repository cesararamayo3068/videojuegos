package com.prog.videojuegos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prog.videojuegos.domain.Videojuego;

@Service
public class VideojuegoService {

	public List<Videojuego> buscarDestacados() {
		List<Videojuego> destacados = new ArrayList<>();

		Videojuego videojuego = new Videojuego();
		videojuego.setNombre("Bioshock Infinite");
		videojuego.setDescripcion("La ultima gran entrega de la saga Bioshock ahora en una imperdible ciudad de ensueño entre las nubes");
        videojuego.setImagenUrl("https://image.api.playstation.com/vulcan/img/cfn/11307sTZ0IfHm2mu2m-Bv67cCZdanpm3BrdhlSEdrfCM_Lk4_LU8iLKiFXzeca0FX_xWI8YQTxGjcbyQjPENYMTj7gE6a0kt.png");
		 destacados.add(videojuego);
		
		videojuego = new Videojuego();
		videojuego.setNombre("Insurfency Sandstorm");
		videojuego.setDescripcion("es un FPS táctico por equipos basado en combates letales en espacios reducidos y multijugador centrado en objetivos. Experimenta la intensidad del combate moderno, en el que se premia la pericia y se gana sabiendo jugar en equipo.");
        videojuego.setImagenUrl("https://cdn1.epicgames.com/salesEvent/salesEvent/EGS_InsurgencySandstormGoldEdition_NewWorldInteractive_Editions_S1_2560x1440-91d034d2615c3366b8b9a6f55efbb2f9");
        destacados.add(videojuego);
        
        videojuego = new Videojuego();
		videojuego.setNombre("The Witness");
		videojuego.setDescripcion("The Witness (en español \"el testigo\") es un videojuego 3D perteneciente al género de rompecabezas creado por Jonathan Blow, desarrollado y publicado por Thekla, Inc. ... Inspirado por Myst, The Witness pone al jugador a explorar un mundo abierto en una isla llena de una serie de estructuras naturales y artificiales.");
        videojuego.setImagenUrl("https://1.bp.blogspot.com/-MYyDCzNUc64/YJ6nS6WHvwI/AAAAAAAArk4/yoThOPojCz0we55tVF9bTaY93XcK24-PQCNcBGAsYHQ/s900/The-Witness.jpg");
        destacados.add(videojuego);
        
        videojuego = new Videojuego();
		videojuego.setNombre("Braid");
		videojuego.setDescripcion("Braid se juega resolviendo puzles físicos en un entorno típico de un juego de plataformas, similar al de Super Mario Bros. Uno de los elementos fundamentales del juego es la habilidad de revertir el tiempo y \"rebobinar\" las acciones realizadas, incluso después de morir.");
        videojuego.setImagenUrl("https://as01.epimg.net/meristation/imagenes/2020/08/06/noticias/1596749504_058991_1596749584_portada_normal.jpg");
        destacados.add(videojuego);
        
        
        return destacados;
	}
}
