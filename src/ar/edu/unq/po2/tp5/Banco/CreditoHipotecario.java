package ar.edu.unq.po2.tp5.Banco;

public class CreditoHipotecario extends Credito{


	
	public CreditoHipotecario(Cliente c, float m, int p) {
		super(c, m, p);
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
	
}
