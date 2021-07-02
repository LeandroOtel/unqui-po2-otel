package ar.edu.unq.po2.tp9.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorTestCase {

	private EncriptadorNaive encriptador; 
	private EncriptarVocales vocales;
	private EncriptarLetrasANumeros numeros;
	
	@BeforeEach
	void setUp() throws Exception{
	
		this.vocales = new EncriptarVocales();
		this.encriptador = new EncriptadorNaive(this.vocales);
		this.numeros = new EncriptarLetrasANumeros();


	}
	@Test
	void encriptadorDeVocales() {
		
		assertEquals(this.encriptador.encriptar("tul"), "tal");
	}

}
