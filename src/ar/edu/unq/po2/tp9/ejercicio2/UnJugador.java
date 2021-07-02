package ar.edu.unq.po2.tp9.ejercicio2;

public class UnJugador extends EstadoMaquina{

	

	@Override
	public String presionarInicio(VideoJuego videoJuego) {
	videoJuego.quitarFicha();
	videoJuego.setEstadoMaquina(new SinFichas());
	return "Comienza el juego para 1 jugador";
		
	}

	@Override
	public void ponerFicha(VideoJuego videoJuego) {
	videoJuego.setEstadoMaquina(new DosJugadores());
		
	}
}
