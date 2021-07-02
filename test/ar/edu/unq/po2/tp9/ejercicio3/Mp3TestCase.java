package ar.edu.unq.po2.tp9.ejercicio3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.ejercicio2.VideoJuego;

public class Mp3TestCase {

	private Mp3 mp3;
	private Song song;
	
	@BeforeEach
	void setUp() throws Exception{
		this.song = new Song();
		this.mp3 = new Mp3(this.song);
	}
	
	@Test
	void mp3Play() {
		assertEquals(this.mp3.play(),"la la la");
	}
	
	@Test
	void mp3PlayAndPaus() {
		this.mp3.play();
		assertEquals(this.mp3.pause(),"la cancion se ha pausado");

	}
	
	@Test
	void mp3PlayAndStop() {
		this.mp3.play();
		assertEquals(this.mp3.stop(),"la cancion se ha detenido, vuelta al modo seleccion");

	}

}
