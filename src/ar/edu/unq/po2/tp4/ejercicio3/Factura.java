package ar.edu.unq.po2.tp4.ejercicio3;

public abstract class Factura implements Cobrable{
	
	private Agencia unaAgencia;
	
	
	
	
	public Factura(Agencia agencia) {
		
		this.unaAgencia = agencia;
		
	}
	
	public Agencia getAgencia() {
		
		return this.unaAgencia;
		
	}
	
	
	public void registrarEnCaja(Caja unaCaja) {
		Double x = this.montoAPagar();
		
		unaCaja.addMonto(x);
		
		//this.getAgencia().registrarPago(this);
		//esto esta comentado para que funcionen los test, ya que registrar pago,
		//no esta implementado en Agencia, debido a que nos abstraímos de su 
		//implementacion.
	}
	
	protected abstract Double montoAPagar();
	
}
