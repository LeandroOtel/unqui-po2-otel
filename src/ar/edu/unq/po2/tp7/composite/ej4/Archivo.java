package ar.edu.unq.po2.tp7.composite.ej4;

import java.time.LocalDate;

public class Archivo implements FileSystem{

	private String name;
	private int tamaño;
	private LocalDate ultimaModificacion;
	
	
	
	

	public Archivo(String nombre, int peso, LocalDate modificado) {
		this.name= nombre;
		this.tamaño= peso;
		this.ultimaModificacion= modificado;
	}

	
	@Override
	public int totalSize() {
		
		return this.tamaño;
	}

	@Override
	public void printStructure() {
		
		
	}

	@Override
	public FileSystem lastModified() {
		
		return this;
	}

	@Override
	public FileSystem oldestElement() {
		
		return this;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public LocalDate getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(LocalDate ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

}
