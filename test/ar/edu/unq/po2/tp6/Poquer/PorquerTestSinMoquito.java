package ar.edu.unq.po2.tp6.Poquer;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.Poquer.Carta;
import ar.edu.unq.po2.tp6.Poquer.PoquerStatus;

class PorquerTestSinMoquito {

private PoquerStatus poquerStatus;
	
	private Carta dj;
	private Carta dq;
	private Carta dk;
	private Carta d10;
	private Carta dA;
	
	
	private Carta ck;
	private Carta cq;
	private Carta pq;
	
	private Carta a;
	private Carta b;
	private Carta c;
	private Carta d;
	private Carta e;
	private Carta f;

	
	
	@BeforeEach
	void setUp() throws Exception{
		this.poquerStatus = new PoquerStatus();
		
		this.dj= new Carta("J","D","Rojo");
		this.dq= new Carta("Q","D","Rojo");
		this.dk= new Carta("K","D","Rojo");
		this.d10= new Carta("10","D","Negro");
		this.dA= new Carta("A","D","Negro");
		
		this.ck= new Carta("K","C","Rojo");
		this.cq= new Carta("Q","C","Rojo");
		this.pq= new Carta("Q","P","Rojo");
		
		this.a= new Carta("J","D","Rojo");
		this.b= new Carta("Q","P","Rojo");
		this.c= new Carta("K","C","Rojo");
		this.d= new Carta("10","T","Rojo");
		this.e= new Carta("A","D","Rojo");
		this.f= new Carta("A","T","Negro");
	}

	

	
	@Test
	void tienePoquerSeparado() {
		assertEquals(poquerStatus.verificar(dj, dq, ck, d10, dA), "Poquer");
	}
	
	
	@Test
	void tienePoquerSeguido() {
		Carta dobleCarta = mock(Carta.class);
		when(dobleCarta.getPalo()).thenReturn("D");
		when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(true);

		assertEquals(poquerStatus.verificar(dj, dq, dq, d10, ck), "Poquer");
	}
	
	@Test
	void noTienePoquer() {
		assertNotEquals(poquerStatus.verificar(dj, dq, dk, ck, cq), "Poquer");
	}
	
	@Test
	void tieneColor() {
		assertEquals(poquerStatus.verificar(a, b, c, d, e), "Color");
	}
	
	@Test
	void noTieneColor() {
		assertNotEquals(poquerStatus.verificar(a, b, c, d, f), "Color");
	}
	
	@Test
	void tieneTrio() {
		assertNotEquals(poquerStatus.verificar(dj, dq, dk, ck, pq), "Trio");
	}

}
