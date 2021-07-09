package ar.edu.unq.po2.tp5.Banco;


public class CreditoPersonal extends Credito{

	
	public CreditoPersonal(Cliente c, float m, int p) {
		super(c, m, p);
	}

	
	@Override
	public Boolean realizarChequeo() {
		
		return (cliente.calcularSueldoAnual()>15000.00 
				&& monto<cliente.getSueldoNeto()*0.70);
	}

}
