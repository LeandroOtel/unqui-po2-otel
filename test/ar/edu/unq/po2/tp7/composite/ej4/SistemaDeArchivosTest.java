package ar.edu.unq.po2.tp7.composite.ej4;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.composite.ej4.Archivo;
import ar.edu.unq.po2.tp7.composite.ej4.Directorio;
import ar.edu.unq.po2.tp7.composite.ej4.FileSystem;

class SistemaDeArchivosTest {

	private Archivo a1;
	private Archivo a2;
	private ArrayList<FileSystem> contenido;
	private ArrayList<FileSystem> vacio;
	private Directorio d1;
	private Directorio d2;
	
	
	@BeforeEach
	void setUp() throws Exception{
		a1= new Archivo("a",5, LocalDate.of(2020,05,10));
		a2= new Archivo("b",15, LocalDate.of(2020,06,10));
		contenido= new ArrayList<FileSystem>();
		vacio= new ArrayList<FileSystem>();
		contenido.add(a1);
		contenido.add(a2);
		d1= new Directorio("d",LocalDate.of(2020,04,01),contenido);
		d2= new Directorio("d",LocalDate.of(2020,03,01),vacio);

	}
	@Test
	void unArchivoDePeso5() {
		
		assertEquals(this.a1.totalSize(), 5);
	}
	
	@Test
	void unaCarpetaCon2ArchivosPesa20() {
		assertEquals(this.d1.totalSize(), 20);
	}
	
	@Test
	void unaCarpetaVaciaPesa0() {
		assertEquals(this.d2.totalSize(), 0);
	}
	
	@Test
	void unaCarpetaCon1arhivoyOtraCarpetaAdentroCon2ArchivosPesa25() {
		d2.agregarElemento(a1);
		d2.agregarElemento(d1);
		assertEquals(this.d2.totalSize(), 25);
	}
	
	@Test
	void elementoMasNuevo() {

		assertEquals(this.d1.lastModified(), this.a2);
	}
	
	@Test
	void elementoMasNuevoConCarpetaAdentro() {
		d2.agregarElemento(d1);
		assertEquals(this.d2.lastModified(), this.a2);
		//assertEquals(this.d2.lastModified(), this.d1);
	}
	
	@Test
	void elementoMasAntiguo() {
		assertEquals(this.d1.oldestElement(), this.d1);
	}

}
