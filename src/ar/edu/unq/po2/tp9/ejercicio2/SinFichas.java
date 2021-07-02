package ar.edu.unq.po2.tp9.ejercicio2;

public class SinFichas extends EstadoMaquina{

	
	@Override
	public String presionarInicio(VideoJuego videoJuego) {

	return "Ingresar Fichas";
		
	}

	@Override
	public void ponerFicha(VideoJuego videoJuego) {
	videoJuego.setEstadoMaquina(new UnJugador());
		
	}
}
