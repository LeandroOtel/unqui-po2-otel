package ar.edu.unq.po2.tp6.Poquer;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import ar.edu.unq.po2.tp6.poquer.Carta;
import ar.edu.unq.po2.tp6.poquer.PoquerStatus;


public class PoquerTest {
	
	
	private PoquerStatus poquerStatus;
	
	
	private Carta dobleCarta;
	private Carta otraDobleCarta;

	
	
	@BeforeEach
	void setUp() throws Exception{
		this.poquerStatus = new PoquerStatus();
		

		
		
	}

	









	@Test
	void tienePoquer() {
		
		this.dobleCarta = mock(Carta.class);
		
		
		when(dobleCarta.getPalo()).thenReturn("D");
		when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(true);
		

		assertEquals(poquerStatus.verificar(
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta)
				, "Poquer");
		
		
	}
	
	@Test
	void noTienePoquer() {

		
		this.dobleCarta = mock(Carta.class);
		
		
		
		when(dobleCarta.getPalo()).thenReturn("D");
		when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(false);
		
		/*String hola = dobleCarta.getPalo();
		String chau = dobleCarta.getColor();
		
		InOrder inOrder = Mockito.inOrder(dobleCarta);
		inOrder.verify(dobleCarta).getPalo();
		inOrder.verify(dobleCarta).getColor();
		
		verify(dobleCarta, times(1)).getColor();*/
		
		
		assertNotEquals(poquerStatus.verificar(
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta), "Poquer");
	}
	
	@Test
	void tieneColor() {
	
		this.dobleCarta = mock(Carta.class);
		
		
		when(dobleCarta.getColor()).thenReturn("Negro");
		when(dobleCarta.esMismoColor(dobleCarta)).thenReturn(true);
		//when(dobleCarta.getPalo()).thenReturn("D");
		//when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(false);
		
		
		assertEquals("Color", poquerStatus.verificar(
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta));
	}
	
	@Test
	void NOtieneColor() {
	
		this.dobleCarta = mock(Carta.class);
		
		
		when(dobleCarta.getColor()).thenReturn("Negro");
		when(dobleCarta.esMismoColor(dobleCarta)).thenReturn(false);
		//when(dobleCarta.getPalo()).thenReturn("D");
		//when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(false);
		
		
		assertNotEquals("Color", poquerStatus.verificar(
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				dobleCarta));
	}
	
	@Test
	void tieneTrio() {
	
		this.dobleCarta = mock(Carta.class);
		
		this.otraDobleCarta = mock(Carta.class);
		
		when(dobleCarta.getPalo()).thenReturn("D");
		when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(true);
		
		
		when(otraDobleCarta.getPalo()).thenReturn("C");
		when(otraDobleCarta.esMismoPalo(otraDobleCarta)).thenReturn(false);
		
		
		
		assertEquals(poquerStatus.verificar(
				dobleCarta, 
				dobleCarta, 
				dobleCarta, 
				otraDobleCarta, 
				otraDobleCarta), "Trio");
	}
}
