package ar.edu.unq.po2.tp8.ej2;

import java.util.ArrayList;

public class SistemaCultivos {

	private ArrayList<Cultivo> cultivos;
	
	public SistemaCultivos() {
		this.cultivos = new ArrayList<Cultivo>();
	}
	
	public void agregarCultivoAlSistema(Cultivo c) {
		this.cultivos.add(c);
		
	}

	public Double sumarGanancias() {
		Double total = 0.0;
		for (Cultivo cultivo : this.cultivos) {
			total += cultivo.gananciaAnual();
		} 
		return total;
	}
	
}
