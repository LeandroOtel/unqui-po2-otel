package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.List;

public class ServidorDeportivo implements Servidor{

	private AplicacionDeportiva aplicacion; 
	private List<String> intereses;
	private List<Partido> partidos;
	
	public ServidorDeportivo(AplicacionDeportiva ad, List<String> inte, List<Partido> part) {
		super();
		this.aplicacion = ad;
		this.intereses = inte;
		this.partidos = part;
	}
	
	@Override
	public void updatePartido(AplicacionDeportiva ad, Partido p) {
		//bueno acá habría que ver si el update notifica con un mensaje, 
		//o si se agrega el partido a la lista de partidos
		
	}
	
	public void registrarse() {
		this.aplicacion.agregarServidor(this, this.intereses);
	}
	
	public void agregarPartido(Partido nuevoP) {
		this.partidos.add(nuevoP);
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

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}


}
