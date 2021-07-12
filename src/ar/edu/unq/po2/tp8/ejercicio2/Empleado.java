package ar.edu.unq.po2.tp8.ejercicio2;

public abstract class Empleado {
	
	public final double sueldo(){
		return this.sueldoBruto() - this.aportesYobraSocial();
	}
	
	public abstract double sueldoBruto();
	
	public double aportesYobraSocial() {
		return this.sueldoBruto()*0.13;
	}
	
}
