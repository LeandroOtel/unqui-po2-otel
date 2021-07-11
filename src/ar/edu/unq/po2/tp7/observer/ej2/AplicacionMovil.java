package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.List;

public class AplicacionMovil implements Listener{

	private AplicacionDeportiva aplicacion; 
	private List<String> intereses;
	
	private List<String> resultados;
	
	public AplicacionMovil(AplicacionDeportiva ad, List<String> interes, List<String> res) {
		super();
		this.aplicacion = ad;
		this.intereses = interes;
		this.resultados = res;
	}
	
	
	public void registrarse() {
		this.aplicacion.agregarServidor(this, this.intereses);
	}
	
	@Override
	public void updatePartido(AplicacionDeportiva ad, Partido p) {
		this.agregarResultado(p);
		
	}
	
	
	public void agregarResultado(Partido nuevoP) {
		this.resultados.add(nuevoP.getResultado());
	}

	public AplicacionDeportiva getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(AplicacionDeportiva aplicacion) {
		this.aplicacion = aplicacion;
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<String> intereses) {
		this.intereses = intereses;
	}

	public List<String> getResultados() {
		return resultados;
	}

	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}



}
