package ar.edu.unq.po2.tp7.composite.ej2;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.composite.ej2.Soja;



public class SojaTest {
	
	private Soja soja;
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.soja = new Soja();
		
		}
		
	@Test
	void sojaGananciaAnual() {
		assertEquals(this.soja.gananciaAnual(), 500.0);
	}
}
