package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private Boolean estaCasado;
	private LocalDate fechaDeNacimiento;
	private Double sueldoBasico;
	
	public Empleado(String nombr, String direc, Boolean estado, 
			LocalDate nacimiento, Double basico) {
		super();
		this.nombre = nombr;
		this.direccion= direc;
		this.estaCasado= estado;
		this.fechaDeNacimiento= nacimiento;
		this.sueldoBasico= basico;
	}

	public abstract Double calcularSueldoBruto();
	
	public abstract Double calcularRetenciones();
	
	public abstract Double calcularRetencionesPorAportesJubilatorios();
	
	
	
	public Double calcularSueldoNeto() {
		return (this.calcularSueldoBruto() - this.calcularRetenciones());
	}
	
	public Double calcularRetencionesPorObraSocial() {
		return this.calcularSueldoBruto()*0.10;
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

	public Boolean getEstaCasado() {
		return this.estaCasado;
	}

	public void setEstaCasado(Boolean estadoCivil) {
		this.estaCasado = estadoCivil;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public Integer edad() {
		LocalDate fechaActual = LocalDate.now();
		Integer edad = fechaActual.getYear() - this.fechaDeNacimiento.getYear();
		return edad;
	}
	
}
