package ar.edu.unq.po2.tp7.observer.ej3;

public interface Observable {
	public void aceptarJugador(Participante participante);
	public void agregarAEspera(Participante participante);
	public void notificarAtodosUnJugadorRespondioBien(Participante participante, Integer numeroPregunta);
	public void notificarRespuestaAcertada(Participante participante);
	public void notificarATodosJugadorGanoPartida(Participante participante);
}
