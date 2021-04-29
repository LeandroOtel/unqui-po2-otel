package ar.edu.unq.po2.tp3.ejercicio4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.ejercicio4.Multioperador;

class MultioperadorTestCase {

	private Multioperador multioperador;
	
	@BeforeEach
	void setUp() throws Exception{
		this.multioperador = new Multioperador();
		multioperador.addNumber(1);
		multioperador.addNumber(2);
		multioperador.addNumber(3);
}
	
	@Test
	public void sumaMultioperador() {

	int amount = multioperador.sumarTodos();

	assertEquals(amount, 6);
	}
	
	@Test
	public void restaMultioperador() {

	int amount = multioperador.restarTodos();

	assertEquals(amount, -6); //-1 -2 -3 = -6
	}
	
	@Test
	public void multiplicarMultioperador() {

	int amount = multioperador.multiplicarTodos();

	assertEquals(amount, 6); //1 * 1 * 2 * 3
	}
}
