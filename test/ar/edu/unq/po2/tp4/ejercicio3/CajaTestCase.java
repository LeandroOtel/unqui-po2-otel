package ar.edu.unq.po2.tp4.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTestCase {

	private Caja caja1;
	private Impuesto impuesto500P;
	private Servicio servicio30x5;
	private Cooperativa bolsonYerba;
	private Tradicional gaseosa;
	private Agencia afip;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
	this.caja1 = new Caja();
	this.impuesto500P = new Impuesto (500.0, afip);
	this.servicio30x5 = new Servicio(30.0,5,12, afip);
	this.bolsonYerba = new Cooperativa("yerba",500.0,3);
	this.gaseosa = new Tradicional("coca",150.0,3);
	}

	
	
	@Test
	void cajaRegistraUnImpuesto() {
		caja1.registrar(impuesto500P);
		assertEquals(caja1.getMonto(), 500.00);
	}
	
	
	@Test
	void cajaRegistraUnServicio() {
		caja1.registrar(servicio30x5);
		assertEquals(caja1.getMonto(), 150.00);
	}
	
	@Test
	void cajaRegistraVariasFacturas() {
		caja1.registrar(servicio30x5);
		caja1.registrar(impuesto500P);
		assertEquals(caja1.getMonto(), 650.00);
	}
	
	
	
	@Test
	void cajaRegistraVariasFacturasYProductos() {
		caja1.registrar(servicio30x5);
		caja1.registrar(impuesto500P);
		caja1.registrar(bolsonYerba);
		caja1.registrar(gaseosa);
		assertEquals(caja1.getMonto(), 1250.00);
	}
	
	
	
	
	
}
