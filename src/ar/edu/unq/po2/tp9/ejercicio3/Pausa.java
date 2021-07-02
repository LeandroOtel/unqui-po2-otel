package ar.edu.unq.po2.tp9.ejercicio3;

public class Pausa extends Modo{

	@Override
	public String play(Mp3 mp3) {
	//Si esta en modo pausa y ponen play no debería retomar la canción
	//el play nomas funciona con el modo Seleccion
	return "error";

		
	}

	@Override
	public String pause(Mp3 mp3) {

	
	mp3.setModo(new Reproduccion());
	return mp3.getSong().play();
		
	}

	@Override
	public String stop(Mp3 mp3) {
	
	
	mp3.setModo(new Seleccion());
	return mp3.getSong().stop();
		
	}	
}

