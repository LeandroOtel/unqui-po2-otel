package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Temporal extends Empleado{

	private LocalDate fechaFin;
	private Integer horasExtras;
	
	public Temporal(String nombr, String direc, Boolean estado, LocalDate nacimiento, Double basico,
			LocalDate fin, Integer horas) {
		super(nombr, direc, estado, nacimiento, basico);
		this.fechaFin = fin;
		this.horasExtras = horas;
	}
	@Override
	public Double calcularSueldoBruto() {
	
		return this.getSueldoBasico()+(horasExtras*40.0);
	}
	@Override
	public Double calcularRetenciones() {
		return this.calcularRetencionesPorObraSocial()
				+this.asignacionPorEdad()
				+this.calcularRetencionesPorAportesJubilatorios()
				+(horasExtras*5);
	}
	
	public Double asignacionPorEdad() {
		if (this.edad()>50) {
			return 25.0;
		}
		else {return 0.0;}
	}
	
	@Override
	public Double calcularRetencionesPorAportesJubilatorios() {
		return this.calcularSueldoBruto()*0.10;
	}

}
