package ar.edu.unq.po2.tp6.poquer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.poquer.Carta;

public class CartaTest {
	private Carta dk;
	private Carta d10;
	private Carta cA;
	private Carta p5;
	
	@BeforeEach
	void setUp() throws Exception{
		
		this.dk= new Carta("K","D","Rojo");
		this.d10= new Carta("10","D","Negro");
		this.cA= new Carta("A","C","Negro");
		this.p5= new Carta("5","P","Negro");
	
	}
	
	@Test
	void sonMismoPalo() {
		assertTrue(dk.esMismoPalo(d10));
	}
	
	@Test
	void sonDiferentePalo() {
		assertFalse(dk.esMismoPalo(cA));
	}
	
	@Test
	void esMayorQue() {
		assertTrue(d10.esMayorQue(p5));
	}
	
	@Test
	void esMenorQue() {
		assertFalse(p5.esMayorQue(cA));
	}
	
	@Test
	void sonMismoColor() {
		assertTrue(cA.esMismoColor(p5));
	}
	
	@Test
	void sonDistintoColor() {
		assertFalse(cA.esMismoColor(dk));
	}
}
