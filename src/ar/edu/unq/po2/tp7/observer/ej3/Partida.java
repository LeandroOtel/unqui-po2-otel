package ar.edu.unq.po2.tp7.observer.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partida {
	
	private Map<Integer, String> preguntas; 
	private Map<Integer,String> respuestas; 
	private List<Participante> jugadoresEnEspera;
	private List<Participante> jugadoresActuales;
	private Map<Participante, Integer> puntajes;
	
	public Partida() {
		this.preguntas = new HashMap<Integer, String>();
		this.respuestas = new HashMap<Integer, String>();
		this.jugadoresActuales = new ArrayList<Participante>();
		this.jugadoresEnEspera = new ArrayList<Participante>();
		this.puntajes = new HashMap<Participante, Integer>();
	}
	
	public void aceptarJugador(Participante participante) {
		if (this.jugadoresEnEspera.contains(participante)){
				this.jugadoresEnEspera.remove(participante);
				this.jugadoresActuales.add(participante);
				participante.updatePreguntas(this);}
	}
	
	public void agregarAEspera(Participante participante) {
		this.jugadoresEnEspera.add(participante);
	}
	
	public Map<Integer, String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Map<Integer, String> preguntas) {
		this.preguntas = preguntas;
	}

	public Map<Integer, String> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(Map<Integer, String> respuestas) {
		this.respuestas = respuestas;
	}

	public List<Participante> getJugadoresEnEspera() {
		return jugadoresEnEspera;
	}

	public void setJugadoresEnEspera(List<Participante> jugadoresEnEspera) {
		this.jugadoresEnEspera = jugadoresEnEspera;
	}

	public List<Participante> getJugadoresActuales() {
		return jugadoresActuales;
	}

	public void setJugadoresActuales(List<Participante> jugadoresActuales) {
		this.jugadoresActuales = jugadoresActuales;
	}

	public Map<Participante, Integer> getPuntajes() {
		return puntajes;
	}

	public void setPuntajes(Map<Participante, Integer> puntajes) {
		this.puntajes = puntajes;
	}

	public void verificarRespuesta(Participante participante, Integer numeroPregunta, String respuesta){
		if ((String)this.respuestas.get(numeroPregunta) ==  (String)respuesta) { 
			this.sumarUnPunto(participante);
			this.notificarRespuestaAcertada(participante);
			this.notificarAtodosUnJugadorRespondioBien(participante, numeroPregunta);
			participante.updatePreguntas(this);
		}
		if (this.puntajes.get(participante).equals(this.preguntas.keySet().size())){
			this.notificarATodosJugadorGanoPartida(participante);
		}
	}
	
	public void notificarAtodosUnJugadorRespondioBien(Participante participante, Integer numeroPregunta){
		for (Participante p : this.jugadoresActuales) {
			p.notificarAlguienRespondioCorrectamente(participante, this.preguntas.get(numeroPregunta));
		} 
	}
	
	public void sumarUnPunto(Participante participante) {
		this.puntajes.put(participante, (this.puntajes.get(participante)+1));
	}
	
	public void notificarRespuestaAcertada(Participante participante) {
		participante.notificarRespuestaAcertada();
	}
	
	

	public void notificarATodosJugadorGanoPartida(Participante participante){
		for (Participante p : this.jugadoresActuales) {
			p.notificarGanador(participante);
		}
	}
}
