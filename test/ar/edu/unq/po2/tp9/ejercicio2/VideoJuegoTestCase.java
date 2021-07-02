package ar.edu.unq.po2.tp9.ejercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoJuegoTestCase {

	private VideoJuego videoJuego;

	
	@BeforeEach
	void setUp() throws Exception{
		this.videoJuego = new VideoJuego();
	}
	
	@Test
	void videoJuegoSinFichas() {
		assertTrue(this.videoJuego.presionarInicio()=="Ingresar Fichas");
	}
	
	@Test
	void videoJuegoConUnaFicha() {
		this.videoJuego.ponerFicha();
		assertTrue(this.videoJuego.presionarInicio()=="Comienza el juego para 1 jugador");
	}
	
	@Test
	void videoJuegoConDosFichas() {
		this.videoJuego.ponerFicha();
		this.videoJuego.ponerFicha();
		assertTrue(this.videoJuego.presionarInicio()=="Comienza el juego para 2 jugadores");
	}
	
	@Test
	void videoLuegoDeJugarSePierdenLasFichas() {
		this.videoJuego.ponerFicha();
		this.videoJuego.ponerFicha();
		this.videoJuego.presionarInicio(); //acá se quitan las fichas
		//entonces vuelve a la primer instancia sin fichas
		assertTrue(this.videoJuego.presionarInicio()=="Ingresar Fichas");
	}
}
