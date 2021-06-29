package ar.edu.unq.po2.tp8.ejercicio2;

public abstract class Empleado {
	
	public final double sueldo(){
		double sueldoBruto = this.sueldoBasico()
									+this.sueldoPorHorasTrabajadas()
									+this.sueldoPorEstadoCivileHijos();
		return sueldoBruto - (13*sueldoBruto/100);
	}
	
	public double sueldoBasico() {
		return 0.0;
	}
	public double sueldoPorHorasTrabajadas() {
		return 0.0;
	}
	public double sueldoPorEstadoCivileHijos() {
		return 0.0;
	}
	
}
