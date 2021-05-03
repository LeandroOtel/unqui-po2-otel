package ar.edu.unq.po2.tp3.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.ejercicio7.Rectangulo;
import ar.edu.unq.po2.tp3.ejercicio6.Point;

class RectanguloTestCase {

	
	private Rectangulo rectangulo;
	private Point punto11;
	//private Point punto14;
	//private Point punto41;
	//private Point punto44;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.punto11 = new Point(1,1);
		//this.punto14 = new Point(1,4);
		//this.punto41 = new Point(4,1);
		//this.punto44 = new Point(4,4);
		this.rectangulo=new Rectangulo(punto11, 3, 3);
		
		
	}
	
	
	
	@Test
	void testConstructor() {
		//abajoIzquierda = new Point(1,1);
		//assertEquals(this.rectangulo.getEsquinaInferiorIzquierda(), punto11);
		//assertEquals(this.rectangulo.getEsquinaInferiorDerecha(), punto41);
		//assertEquals(this.rectangulo.getEsquinaSuperiorDerecha(), punto44);
		//assertEquals(this.rectangulo.getEsquinaInferiorIzquierda(), abajoIzquierda);
		
		assertEquals(this.rectangulo.getEsquinaInferiorIzquierda().getX(), 1);
		assertEquals(this.rectangulo.getEsquinaInferiorIzquierda().getY(), 1);
		
		
		assertEquals(this.rectangulo.getEsquinaInferiorDerecha().getX(), 4);
		assertEquals(this.rectangulo.getEsquinaInferiorDerecha().getY(), 1);
		
		

		
		assertEquals(this.rectangulo.getEsquinaSuperiorIzquierda().getX(), 1);
		assertEquals(this.rectangulo.getEsquinaSuperiorIzquierda().getY(), 4);
		
		
		assertEquals(this.rectangulo.getEsquinaSuperiorDerecha().getX(), 4);
		assertEquals(this.rectangulo.getEsquinaSuperiorDerecha().getY(), 4);
		
	}
}
