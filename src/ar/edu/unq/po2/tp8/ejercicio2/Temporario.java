package ar.edu.unq.po2.tp8.ejercicio2;

public class Temporario extends Empleado{
	private double sueldoBasico;
	private int cantidadDeHorasTrabajadas;
	private Boolean tieneHijos;
	private Boolean estaCasado;
	
	public Temporario(double basico, int cantHoras, Boolean hijos, Boolean casado){
		this.sueldoBasico = basico;
		this.cantidadDeHorasTrabajadas = cantHoras;
		this.tieneHijos = hijos;
		this.estaCasado = casado;
}
	
	@Override
	public double sueldoBasico() {
		return this.sueldoBasico;
	}
	
	@Override
	public double sueldoPorHorasTrabajadas() {
		return this.cantidadDeHorasTrabajadas*5.0;
	}
	
	@Override
	public double sueldoPorEstadoCivileHijos() {
		if(this.tieneHijos==true || this.estaCasado==true) 
			{return 100.0;}
		return 0.0;
	}
}
