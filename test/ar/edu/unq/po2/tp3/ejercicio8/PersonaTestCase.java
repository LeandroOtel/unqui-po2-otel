package ar.edu.unq.po2.tp3.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


//import ar.edu.unq.po2.tp3.ejercicio8.Persona;
class PersonaTestCase {

	
	private Persona pepe;
	private Persona lalo;
	
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.pepe = new Persona("pepe", LocalDate.of(1994, 05, 27));
		this.lalo = new Persona("lalo", LocalDate.of(2000, 11, 02));
		
		
	}
	
	
	
	
	@Test
	void calcularEdad() {
		assertEquals(27, pepe.edad());
	}
	
	@Test
	void laloEsMenorQuePepe() {
		assertTrue(lalo.menorQue(pepe));
	}

}
