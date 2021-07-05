package ar.edu.unq.po2.tp7.observer.ej3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Jugador implements Participante{

	private Integer numeroPreguntaActual;
	private String preguntaActual;
	private Partida partidaActual; 
	private List<String> mensajes;
	private String nombre;
	
	

	public Jugador() {
		super();
		this.preguntaActual = new String();
		this.numeroPreguntaActual = 1;
		this.partidaActual = new Partida();
		this.mensajes = new ArrayList<String>();
		this.nombre = "";
	}
	
	public void solicitarUnirse(Partida partida) {
		partida.agregarAEspera(this);
	}
	
	public void verificarRespuesta(String respuesta) {
		this.partidaActual.verificarRespuesta(this, this.numeroPreguntaActual, respuesta);
	}
	
	public void agregarMensaje(String mensaje){
		this.mensajes.add(mensaje);
	}
	
	
	@Override
	public void updatePreguntas(Partida partida) {
		this.numeroPreguntaActual = this.numeroPreguntaActual +1;
		this.preguntaActual = partida.getPreguntas().get(numeroPreguntaActual);
		
	}

	public void notificarRespuestaAcertada() {
		this.agregarMensaje("Correcto!");
		
	}

	@Override
	public void notificarAlguienRespondioCorrectamente(Participante p, String enunciado) {
		this.agregarMensaje(p.getNombre() + "respondio bien" + enunciado);
		
	}

	@Override
	public void notificarGanador(Participante p) {
		this.agregarMensaje("el jugador gano la partida" + p.getNombre());
}
	
	public Integer getNumeroPreguntaActual() {
		return numeroPreguntaActual;
	}

	public void setNumeroPreguntaActual(Integer numeroPreguntaActual) {
		this.numeroPreguntaActual = numeroPreguntaActual;
	}

	public String getPreguntaActual() {
		return preguntaActual;
	}

	public void setPreguntaActual(String preguntaActual) {
		this.preguntaActual = preguntaActual;
	}

	public Partida getPartidaActual() {
		return partidaActual;
	}

	public void setPartidaActual(Partida partidaActual) {
		this.partidaActual = partidaActual;
	}

	public List<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
