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
	
	public double sueldoBruto() {
		return
		(this.getSueldoBasico()
		+this.sueldoPorHorasTrabajadas()
		+this.sueldoPorEstadoCivileHijos());
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	
	public double sueldoPorHorasTrabajadas() {
		return this.cantidadDeHorasTrabajadas*5.0;
	}
	
	
	public double sueldoPorEstadoCivileHijos() {
		if(this.tieneHijos==true || this.estaCasado==true) 
			{return 100.0;}
		else {return 0.0;}
	}
}
