package ar.edu.unq.po2.tp10.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	protected Boolean sePuedeExtraer(Integer monto) {
		return this.getSaldo() >= monto;
	}
	

}
