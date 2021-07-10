package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.List;

public class AplicacionMovil implements Servidor{

	private Observable aplicacion; 
	private List<String> intereses;
	private List<String> resultados;
	
	public AplicacionMovil(Observable ad, List<String> interes, List<String> res) {
		super();
		this.aplicacion = ad;
		this.intereses = interes;
		this.resultados = res;
	}
	
	
	public void registrarse() {
		this.aplicacion.agregarServidor(this, this.intereses);
	}
	
	@Override
	public void updatePartido(Observable ad, Partido p) {
		//bueno acá habría que ver si el update notifica con un mensaje, 
		//o si se agrega el resultado a la lista de resultados
		
	}
	
	
	public void agregarResultado(Partido nuevoP) {
		this.resultados.add(nuevoP.getResultado());
	}

	public Observable getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Observable aplicacion) {
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
