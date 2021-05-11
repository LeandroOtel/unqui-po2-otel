package ar.edu.unq.po2.tp4.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {

	private Caja caja1;
	private Cooperativa bolsonYerba;
	private Tradicional gaseosa;
	
	@BeforeEach
	void setUp() throws Exception{
	this.caja1 = new Caja();
	this.bolsonYerba = new Cooperativa("yerba",500.0,3);
	this.gaseosa = new Tradicional("coca",150.0,3);
	
	
	
	
	
	}

	
	
	@Test
	void cajaRegistraUnProductoTradicional() {
		caja1.registrarProducto(gaseosa);
		assertEquals(caja1.getMonto(), 150.00);
	}
	
	
	
	
	
	@Test
	void cajaRegistraUnProductoCooperativa() {
		caja1.registrarProducto(bolsonYerba);
		assertEquals(caja1.getMonto(), 450.00);
	}
	
	
	
	@Test
	void cajaRegistraVariosProductos() {
		caja1.registrarProducto(bolsonYerba);
		caja1.registrarProducto(gaseosa);
		assertEquals(caja1.getMonto(), 600.00);
	}
	
	
	@Test
	void productosReducenStock() {
		caja1.registrarProducto(bolsonYerba);
		caja1.registrarProducto(gaseosa);
		caja1.registrarProducto(gaseosa);
		assertEquals(bolsonYerba.getStock(), 2);
		assertEquals(gaseosa.getStock(), 1);
	}

}
