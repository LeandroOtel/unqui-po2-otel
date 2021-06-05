package ar.edu.unq.po2.tp6.Poquer;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.poquer.Carta;
import ar.edu.unq.po2.tp6.poquer.PoquerStatus;

public class PoquerTestCase {
	private PoquerStatus poquerStatus;
	
	private Carta dj;
	private Carta dq;
	private Carta dk;
	private Carta d10;
	private Carta dA;
	
	
	private Carta ck;
	private Carta cq;
	private Carta pq;
	
	private Carta dobleCarta;

	
	
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
		this.pq= new Carta("Q","P","Negro");
	}

	
	@Test
	void tienePoquerSeguido() {
		Carta dobleCarta = mock(Carta.class);
		when(dobleCarta.getPalo()).thenReturn("D");
		assertEquals(poquerStatus.verificar(dj, dq, dk, ck, dobleCarta), "Poquer");
	}
}
