package ar.edu.unq.po2.tp3.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import ar.edu.unq.po2.tp3.ejercicio7.Rectangulo;
import ar.edu.unq.po2.tp3.ejercicio6.Point;

class RectanguloTestCase {

	
	private Rectangulo rectangulo;
	private Point punto11;
	private Cuadrado cuadrado;
	//private Point punto14;
	//private Point punto41;
	//private Point punto44;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.punto11 = new Point(1,1);
		//this.punto14 = new Point(1,4);
		//this.punto41 = new Point(4,1);
		//this.punto44 = new Point(4,4);
		this.rectangulo=new Rectangulo(punto11, 2, 3);
		this.cuadrado= new Cuadrado(punto11, 3);
		
		
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
		assertEquals(this.rectangulo.getEsquinaSuperiorIzquierda().getY(), 3);
		
		
		assertEquals(this.rectangulo.getEsquinaSuperiorDerecha().getX(), 4);
		assertEquals(this.rectangulo.getEsquinaSuperiorDerecha().getY(), 3);
		
	}
	
	@Test
	void testAreaRectangulo() {
		assertEquals(this.rectangulo.area(), 6);
	}
	
	
	
	
	@Test
	void testPerimetroRectangulo() {
		assertEquals(this.rectangulo.perimetro(), 10);
	}
	
	
	
	
	@Test
	void tipoDeRectangulo() {
		assertEquals(this.rectangulo.tipo(), "horizontal");
	}
	
	@Test
	void testAreaCuadrado() {
		assertEquals(this.cuadrado.area(), 9);
	}
	
	
	@Test
	void testPerimetroCuadrado() {
		assertEquals(this.cuadrado.perimetro(), 12);
	}
}
