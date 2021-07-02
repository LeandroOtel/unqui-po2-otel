package ar.edu.unq.po2.tp9.ejercicio3;

public class Seleccion extends Modo{
	
	@Override
	public String play(Mp3 mp3){
	
	
	mp3.setModo(new Reproduccion());
	return mp3.getSong().play();
		
	}

	@Override
	public String pause(Mp3 mp3) {
	
	return "error";
		
	}

	@Override
	public String stop(Mp3 mp3) {
	
	return "error";
		
	}	
}
