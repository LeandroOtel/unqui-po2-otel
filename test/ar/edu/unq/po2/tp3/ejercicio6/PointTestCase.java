package ar.edu.unq.po2.tp3.ejercicio6;

import ar.edu.unq.po2.tp3.ejercicio6.Point;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PointTestCase {

	private Point punto12;
	private Point punto33;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		this.punto12 = new Point(1,2);
		this.punto33 = new Point(3,3);
	}
	
	
	@Test
	void creoUnPuntoX4Y5() {
		Point punto45 = new Point(4,5);
		
		int x = punto45.getX();
		int y = punto45.getY();
		
		assertEquals(x, 4);
		assertEquals(y, 5);
	}
	
	@Test
	public void creoUnPuntoX1Y2() {
		
		int x = this.punto12.getX(); //ya esta creado en el setup
		int y = this.punto12.getY();
		
		assertEquals(x, 1);
		assertEquals(y, 2);
	}
	
	@Test
	public void creoUnPuntoSinParametros() {
		
		Point puntoSinParametros = new Point();
		
		int x = puntoSinParametros.getX();
		int y = puntoSinParametros.getY();
		
		assertEquals(x, 0);
		assertEquals(y, 0);
	}
	
	@Test
	public void muevoPuntoX1Y2HaciaX5Y2() {
		
		this.punto12.moverHasta(5,2);		//ya esta creado en el setup
		
		int x = this.punto12.getX(); 
		int y = this.punto12.getY();
		
		assertEquals(x, 5);
		assertEquals(y, 2);
	}
	
	public void sumoPuntosX1Y2ConX3Y3() {
		
		Point nuevoPunto = this.punto12.sumarseCon(this.punto33);
		
		
		int x = nuevoPunto.getX(); 
		int y = nuevoPunto.getY();
		
		assertEquals(x, 4);
		assertEquals(y, 5);
	}
}
