package ar.edu.unq.po2.tp10.registro;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}
	
	public Boolean debeRealizarVTV(LocalDate fecha) {
		return this.tieneAntiguedad(fecha) && this.esDeBuenosAires();
	}
	
	public Boolean tieneAntiguedad(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(this.fechaFabricacion);
	}
	
	public Boolean esDeBuenosAires() {
		return this.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}
}
