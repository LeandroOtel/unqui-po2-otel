package ar.edu.unq.po2.tp7.observer.ej3;
import java.util.Map;

public interface Participante {

	public void updatePreguntas(Partida partida);

	public void notificarRespuestaAcertada();

	public void notificarAlguienRespondioCorrectamente(Participante p, String enunciado);

	public void notificarGanador(Participante p);
	
	public String getNombre();
}
