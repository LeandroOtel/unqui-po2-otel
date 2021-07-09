package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Permanente extends Empleado{

	
	private Integer cantidadHijos;
	private Integer antiguedad;
	
	public Permanente(String nombr, String direc, Boolean estado, LocalDate nacimiento, Double basico,
			Integer hijos, Integer antigue) {
		super(nombr, direc, estado, nacimiento, basico);
		this.cantidadHijos = hijos;
		this.antiguedad = antigue;
	}

	@Override
	public Double calcularSueldoBruto() {
		return this.asignacionPorAntiguedad()
				+this.asignacionPorConyuge()
				+this.asignacionPorHijo()
				+this.getSueldoBasico();
	}
	
	public Double asignacionPorHijo() {
		return this.cantidadHijos*150.0;
	}
	
	public Double asignacionPorConyuge() {
		if (this.getEstaCasado()) {
			return 100.0;
		}
		else {return 0.0;}
	}
	
	public Double asignacionPorAntiguedad() {
		return this.antiguedad*50.0;
	}
	
	

	@Override
	public Double calcularRetenciones() {
		return this.calcularRetencionesPorObraSocial()
				+this.retencionesPorHijo()
				+this.calcularRetencionesPorAportesJubilatorios();
	}
	
	private Double retencionesPorHijo() {

		return this.cantidadHijos*20.0;
	}

	@Override
	public Double calcularRetencionesPorAportesJubilatorios() {
		return this.calcularSueldoBruto()*0.15;
	}

}
