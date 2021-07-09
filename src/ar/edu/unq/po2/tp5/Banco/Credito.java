package ar.edu.unq.po2.tp5.Banco;

public abstract class Credito implements SolicitudDeCredito{

	protected Cliente cliente;
	protected float monto;
	protected int plazoEnMeses;
	
	
	public Credito(Cliente c, float m, int p) {
		this.cliente=c;
		this.monto=m;
		this.plazoEnMeses=p;
	}
	
	public float cuotaPorMes() {
		return monto/plazoEnMeses;
	}
	
	public abstract Boolean realizarChequeo();
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getMonto() {
		return this.monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
}
