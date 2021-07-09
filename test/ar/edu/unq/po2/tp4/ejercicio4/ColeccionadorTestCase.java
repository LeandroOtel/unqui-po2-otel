package ar.edu.unq.po2.tp4.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ejercicio3.Agencia;
import ar.edu.unq.po2.tp4.ejercicio3.Cobrable;
import ar.edu.unq.po2.tp4.ejercicio3.Cooperativa;
import ar.edu.unq.po2.tp4.ejercicio3.Impuesto;
import ar.edu.unq.po2.tp4.ejercicio3.Tradicional;

import java.util.ArrayList;


class ColeccionadorTestCase {

	ColeccionadorDeObjetos coleccionador = new ColeccionadorDeObjetos();
	ArrayList<Cobrable> productos;
	private Cooperativa bolsonYerba;
	private Tradicional gaseosa;
	private Impuesto impuesto500P;
	private Agencia afip;
	
	
	@BeforeEach
	void setUp() throws Exception{
	productos = new ArrayList<Cobrable>();
	this.bolsonYerba = new Cooperativa("yerba",500.0,3);
	this.gaseosa = new Tradicional("coca",150.0,3);
	this.impuesto500P = new Impuesto (500.0, afip);
	this.productos.add(impuesto500P);
	this.productos.add(bolsonYerba);
	this.productos.add(gaseosa);
	}
	
	@Test
	void obtenerPrimerElemento() {
		assertEquals(coleccionador.getFirstFrom(productos), impuesto500P);
	}
	
	@Test
	void agregarFinal() {
		coleccionador.addLast(bolsonYerba, productos);
		assertEquals(coleccionador.getFirstFrom(productos), impuesto500P);
	}

}
