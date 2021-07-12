package ar.edu.unq.po2.tp7.observer.ej3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.ejercicio2.Pasante;
import ar.edu.unq.po2.tp8.ejercicio2.Planta;
import ar.edu.unq.po2.tp8.ejercicio2.Temporario;

public class PartidaTestCase {
	private Partida partida;
	private Jugador jugador1;
	private Jugador jugador2;
	private HashMap<Integer, String> preguntas;
	private HashMap<Integer, String> respuestas;
	private String string; 
	
	@BeforeEach
	void setUp() throws Exception{
		this.partida = new Partida();
		this.jugador1 = new Jugador();
		this.jugador2 = new Jugador();
		
		this.preguntas = new HashMap<Integer, String>();
		this.respuestas = new HashMap<Integer, String>();
		
		this.preguntas.put(0, "a");
		this.preguntas.put(1, "a");
		
		this.respuestas.put(0, "a");
		this.respuestas.put(1, "a");
		this.respuestas.put(2, "a");
		
		this.partida.setPreguntas(preguntas);
		this.partida.setRespuestas(respuestas);

	}
	
	@Test
	void unaPartidaTieneJugadoresEnEspera() {
		this.jugador1.solicitarUnirse(partida);
		this.jugador2.solicitarUnirse(partida);
		assertEquals(partida.getJugadoresEnEspera().size(), 2);
	}
	
	@Test
	void unaPartidaAceptaDosJugadores() {
		this.jugador1.solicitarUnirse(partida);
		this.jugador2.solicitarUnirse(partida);
		this.partida.aceptarJugador(jugador1);
		this.partida.aceptarJugador(jugador2);
		assertEquals(partida.getJugadoresEnEspera().size(), 0);
		assertEquals(partida.getJugadoresActuales().size(), 2);
	}
	
	@Test
	void unJugadorRespondeBien() {
		this.jugador1.solicitarUnirse(partida);
		this.partida.aceptarJugador(jugador1);
		this.jugador1.verificarRespuesta("a");
		assertEquals(jugador1.getMensajes().size(),1);
	}
	
}
