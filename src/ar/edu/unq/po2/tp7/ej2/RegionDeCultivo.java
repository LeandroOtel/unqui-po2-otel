package ar.edu.unq.po2.tp8.ej2;

import java.util.ArrayList;
import java.util.List;

public class RegionDeCultivo implements Cultivo{

	private ArrayList<Cultivo> cultivos;
	
	
	public RegionDeCultivo() {
		cultivos = new ArrayList<Cultivo>();
	}
	
	
	
	
	public void agregarCultivo(Cultivo c) {
		this.cultivos.add(c);
		
	}


	@Override 
	public Double gananciaAnual() {
		Double ganancia = 0.0;
		for (Cultivo cultivo : this.cultivos) {
			ganancia += cultivo.gananciaAnual();
		}
		return ganancia/4;
	}
	
	public List<Cultivo> getCultivos(){
		return this.cultivos;
	}
}

