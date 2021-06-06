package ar.edu.unq.po2.tp7.composite.ej2;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.composite.ej2.Trigo;



public class TrigoTest {
	
	private Trigo trigo;
	
	@BeforeEach
	void setUp() throws Exception{
		this.trigo = new Trigo();
		}
		
	@Test
	void trigoGananciaAnual() {
		assertEquals(this.trigo.gananciaAnual(), 300.0);
	}
}
