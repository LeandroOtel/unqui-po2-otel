package ar.edu.unq.po2.tp9.ejercicio3;

public class Reproduccion extends Modo{

	public Reproduccion(Mp3 nuevoMp3) {
		this.mp3 = nuevoMp3;
	}
	
	@Override
	public String play(Mp3 mp3) {
	
	return "error";
		
	}

	@Override
	public String pause(Mp3 mp3) {

	
	mp3.setModo(new Pausa(this.mp3));
	return mp3.getSong().pause();
		
	}

	@Override
	public String stop(Mp3 mp3) {
	
	
	mp3.setModo(new Seleccion(this.mp3));
	return mp3.getSong().stop();
		
	}	
}