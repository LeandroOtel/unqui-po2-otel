package ar.edu.unq.po2.tp3.ejercicio8;

import java.time.LocalDate;

public class Persona {
	
	
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	
	public Persona(String unNombre, LocalDate unaFecha) {
		nombre = unNombre;
		fechaDeNacimiento = unaFecha;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public Integer edad() {
		//LocalDate edad = LocalDate.from(LocalDate.now());
		LocalDate fechaActual = LocalDate.now();
		Integer edad = fechaActual.getYear() - this.fechaDeNacimiento.getYear();
		return edad;
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad()< persona.edad();
	}
	
	
	
	
}
