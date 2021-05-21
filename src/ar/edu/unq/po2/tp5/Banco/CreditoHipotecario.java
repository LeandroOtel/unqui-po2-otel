package ar.edu.unq.po2.tp5.Banco;

public class CreditoHipotecario implements SolicitudDeCredito{

	private Cliente cliente;
	private float monto;
	private int plazoEnMeses;
	
	
	
	
	public CreditoHipotecario(Cliente c, float m, int p) {
		cliente = c;
		monto = m;
		plazoEnMeses = p;
	}

	
	public float cuotaPorMes() {
		return monto/plazoEnMeses;
	}
	
	
	
	@Override
	public Boolean realizarChequeo() {
		
		return (this.chequearEdad() 
				&& this.chequearIngresos()
				&& this.chequearValorFiscal());
	}
	
	public Boolean chequearIngresos() {
		return monto < cliente.getSueldoNeto()*0.50;
	}
	
	
	public Boolean chequearValorFiscal() {
		return monto < cliente.getPropiedad().getValorFiscal()*0.70;
	}
	
	
	public Boolean chequearEdad() {
		return (cliente.getEdad() + plazoEnMeses) < 65;
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
