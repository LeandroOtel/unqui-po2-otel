package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {

	
	private String nombre;
	private String direccion;
	private LocalDate fechaEmision;
	private Double sueldoBruto;
	private Double sueldoNeto;
	private Double retenciones;
	
	public ReciboDeHaberes(Empleado emp) {
		this.nombre = emp.getNombre();
		this.direccion = emp.getDireccion();
		this.fechaEmision = LocalDate.now();
		this.sueldoBruto = emp.calcularSueldoBruto();
		this.sueldoNeto = emp.calcularSueldoNeto();
		this.retenciones = emp.calcularRetenciones();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(Double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public Double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public Double getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(Double retenciones) {
		this.retenciones = retenciones;
	}


	
}
