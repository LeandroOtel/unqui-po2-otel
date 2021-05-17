package ar.edu.unq.po2.tp4.ejercicio3;

public class Caja {
	
	
	private Double montoTotal;
	//private AgenciaRecaudadora miAgencia;
	
	
	
	
	public Caja(){
		montoTotal = 0.0;
		//miAgencia = new AgenciaRecaudadora();

	}
	
	public void registrar(Cobrable unCobrable) {
		unCobrable.registrarEnCaja(this);
	}
	
	
	public Double getMonto() {
		return montoTotal;
	}
	
	
	public void addMonto(Double unMonto) {
		montoTotal += unMonto;
	}
}
