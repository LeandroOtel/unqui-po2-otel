package ar.edu.unq.po2.tp8.ejercicio2;

public class Planta extends Empleado{
	private double sueldoBasico;
	private int cantidadDeHijos;
	
	public Planta(double sueldo, int hijos) {
		this.sueldoBasico = sueldo;
		this.cantidadDeHijos = hijos;
	}
	
	@Override
	public double sueldoBasico() {
		return this.sueldoBasico;
	}
	
	@Override
	public double sueldoPorEstadoCivileHijos() {
		return 150.0 * this.cantidadDeHijos;
	}
}
