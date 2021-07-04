package ar.edu.unq.po2.tp10.registro;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
		Boolean debeRealizarVTV = vehiculo.debeRealizarVTV(fecha);
		
		return (!esVehiculoPolicial && debeRealizarVTV);

	}
}

