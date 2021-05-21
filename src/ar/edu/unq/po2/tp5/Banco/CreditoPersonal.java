package ar.edu.unq.po2.tp5.Banco;


public class CreditoPersonal implements SolicitudDeCredito{

	private Cliente cliente;
	private float monto;
	private int plazoEnMeses;
	
	
	
	
	public CreditoPersonal(Cliente c, float m, int p) {
		cliente = c;
		monto = m;
		plazoEnMeses = p;
	}

	
	public float cuotaPorMes() {
		return monto/plazoEnMeses;
	}
	
	@Override
	public Boolean realizarChequeo() {
		
		return (cliente.calcularSueldoAnual()>15000.00 
				&& monto<cliente.getSueldoNeto()*0.70);
	}
	
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
