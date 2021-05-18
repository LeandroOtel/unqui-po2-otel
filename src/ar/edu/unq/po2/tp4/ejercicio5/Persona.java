package ar.edu.unq.po2.tp4.ejercicio5;

import java.time.LocalDate;

public class Persona implements Nombrable{
		
		private String nombre;
		private LocalDate fechaDeNacimiento;
		
		
		
		
		public Persona(String nombre, LocalDate fechaDeNacimiento) {
			this.setNombre(nombre);
			this.setFechaDeNacimiento(fechaDeNacimiento);
		}
		
		
		
		
		public int edad() {
			return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
		}
		
		
		
		
		public boolean esMenorQue(Persona persona) {
			return this.edad() < persona.edad();
		}
		
		
		
		
		public boolean esMayorQue(Persona persona) {
			return this.edad() > persona.edad();
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
}
