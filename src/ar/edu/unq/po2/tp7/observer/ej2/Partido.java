package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	
	public Partido(String r, List<String> c, String d) {
		super();
		this.resultado = r;
		this.contrincantes = c;
		this.deporte = d;
	}
	
	public List<String> getInformacion(){
		
		List<String> informacionPartido = new ArrayList<String>();
		
		informacionPartido.add(resultado);
		
		informacionPartido.add(deporte);
		
		for (String contrincante : this.contrincantes) {
			informacionPartido.add(contrincante);
			}
		return informacionPartido;
	}


	public String getResultado() {
		return resultado;
	}


	public void setResultado(String resultado) {
		this.resultado = resultado;
	}


	public List<String> getContrincantes() {
		return contrincantes;
	}


	public void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}


	public String getDeporte() {
		return deporte;
	}


	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
}
