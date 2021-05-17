package ar.edu.unq.po2.tp4.ejercicio3;

public class Impuesto extends Factura{
	
	
	Double tasaDeServicio;
	
	
	
	public Impuesto(Double costoTasa, Agencia agencia) {
		
		super(agencia);
		
		this.tasaDeServicio=costoTasa;
		
	}
	
	protected Double montoAPagar() {
		
		return this.tasaDeServicio;
	}

}
