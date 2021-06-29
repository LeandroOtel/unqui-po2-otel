package ar.edu.unq.po2.tp8.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmpleadoTestCase {

	private Temporario temporario1;
	private Temporario temporario2;
	private Pasante pasante1;
	private Planta planta1;

	
	@BeforeEach
	void setUp() throws Exception{
		this.temporario1 = new Temporario(1000.0, 100, false, false);
		
		this.temporario2 = new Temporario(1000.0, 100, true, true);
		
		this.pasante1 = new Pasante(100);
		
		this.planta1 = new Planta(2000.0, 2);

	}
	
	@Test
	void temporario1Sueldo() {
		assertEquals(this.temporario1.sueldo(),1305.0);
	}
	
	@Test
	void temporario2Sueldo() {
		assertEquals(this.temporario2.sueldo(),1392.0);
	}
	
	@Test
	void pasanteSueldo() {
		assertEquals(this.pasante1.sueldo(),3480.0);
	}

	@Test
	void plantaSueldo() {
		assertEquals(this.planta1.sueldo(),2001.0);
	}
}
