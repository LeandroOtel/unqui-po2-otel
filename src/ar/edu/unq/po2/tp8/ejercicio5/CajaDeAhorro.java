package ar.edu.unq.po2.tp8.ejercicio5;

public class CajaDeAhorro extends CuentaBancaria{
	private int limite;
	public CajaDeAhorro(String titular, int limite){
	super(titular);
	this.limite=limite;
	}
	public int getLimite(){
	return this.limite;
	}
	@Override
	protected Boolean verificarPosibleExtraccion(int monto) {
	return(this.getSaldo()>=monto && this.getLimite()>=monto);
	}
}