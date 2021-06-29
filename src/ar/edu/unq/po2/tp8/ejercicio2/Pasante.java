package ar.edu.unq.po2.tp8.ejercicio2;

public class Pasante extends Empleado{
	
	private int cantidadDeHorasTrabajadas;
	
	public Pasante(int cantHoras) {
		this.cantidadDeHorasTrabajadas = cantHoras;
	}
	
	@Override
	public double sueldoPorHorasTrabajadas() {
		return this.cantidadDeHorasTrabajadas*40.0;
	}
}
