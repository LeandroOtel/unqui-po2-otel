package ar.edu.unq.po2.tp4.ejercicio3;

public class Servicio extends Factura {
	
	
	Double costoPorUnidad;
	int unidadesConsumidas;
	int periodo;
	
	
	
	
	public Servicio(Double costoUnitario, int cantidadUnidades,int ciclo,
			
			Agencia agencia) {
		
		super(agencia);
		
		this.costoPorUnidad =costoUnitario;
		
		this.unidadesConsumidas=cantidadUnidades;
		
		this.periodo=ciclo;
	}
	
	
	
	
	protected Double montoAPagar() {
		return costoPorUnidad * unidadesConsumidas;
	}


	
}
