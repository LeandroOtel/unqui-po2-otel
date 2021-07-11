package ar.edu.unq.po2.tp9.ejercicio2;

public class DosJugadores extends EstadoMaquina{
	
	public DosJugadores(VideoJuego videojuego) {
		this.videoJuego= videojuego;
	}
	
	@Override
	public String presionarInicio(VideoJuego videoJuego) {
	videoJuego.quitarFicha();
	videoJuego.quitarFicha();
	videoJuego.setEstadoMaquina(new SinFichas(this.videoJuego));
	return "Comienza el juego para 2 jugadores";
		
	}

	@Override
	public void ponerFicha(VideoJuego videoJuego) {
		
	}
}
