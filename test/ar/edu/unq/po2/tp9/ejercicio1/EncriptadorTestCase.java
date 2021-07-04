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
		
		assertEquals(this.encriptador.encriptar("aeiou"), "eioua");
	}
	
	@Test
	void encriptadorDeVocalesInvertido() {
		
		assertEquals(this.encriptador.desencriptar("aeiou"), "uaeio");
	}
	
	@Test
	void encriptadorDeNumeros() {
		this.encriptador.setMetodoDeEncriptacion(numeros);
		assertEquals(this.encriptador.encriptar("abc"), "1,2,3,");
	}
	
	@Test
	void encriptadorDeNumerosInvertido() {
		this.encriptador.setMetodoDeEncriptacion(numeros);
		assertEquals(this.encriptador.desencriptar("1,2,3,"), "abc");
	}

}
