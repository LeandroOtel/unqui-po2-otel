package ar.edu.unq.po2.tp10.cuenta;

public abstract class CuentaBancaria {
	private HistorialMovimientos historialDeMovimientos;
	private Notificador notificador;
	private int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public final void extraer(Integer monto) {
		if (this.sePuedeExtraer(monto)) {
			this.saldo -=monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		} 
	}
	
	protected abstract Boolean sePuedeExtraer(Integer monto);
}
