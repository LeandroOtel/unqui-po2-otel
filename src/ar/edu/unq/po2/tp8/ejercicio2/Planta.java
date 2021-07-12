package ar.edu.unq.po2.tp8.ejercicio2;

public class Planta extends Empleado{
	private double sueldoBasico;
	private int cantidadDeHijos;
	
	public Planta(double sueldo, int hijos) {
		this.sueldoBasico = sueldo;
		this.cantidadDeHijos = hijos;
	}
	
	public double sueldoBruto() {
		return(
		this.getSueldoBasico()
		+this.sueldoPorEstadoCivileHijos());
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public double sueldoPorEstadoCivileHijos() {
		return 150.0 * this.cantidadDeHijos;
	}
}
