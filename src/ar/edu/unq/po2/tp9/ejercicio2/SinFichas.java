package ar.edu.unq.po2.tp9.ejercicio2;

public class SinFichas extends EstadoMaquina{

	public SinFichas(VideoJuego videojuego) {
		this.videoJuego= videojuego;
	}
	
	@Override
	public String presionarInicio(VideoJuego videoJuego) {

	return "Ingresar Fichas";
		
	}

	@Override
	public void ponerFicha(VideoJuego videoJuego) {
	videoJuego.setEstadoMaquina(new UnJugador(this.getVideojuego()));
		
	}
}
