package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Contratado extends Empleado{

	private Integer numeroContrato;
	private String medioDePago;
	
	public Contratado(String nombr, String direc, Boolean estado, LocalDate nacimiento, Double basico,
			Integer contrato, String medio) {
		super(nombr, direc, estado, nacimiento, basico);
		this.medioDePago = medio;
		this.numeroContrato = contrato;
	}

	@Override
	public Double calcularSueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public Double calcularRetenciones() {
		return 50.0;
	}

	@Override
	public Double calcularRetencionesPorAportesJubilatorios() {
		return 0.0;
	}

}
