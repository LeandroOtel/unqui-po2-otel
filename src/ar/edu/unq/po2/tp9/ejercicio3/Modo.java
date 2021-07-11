package ar.edu.unq.po2.tp9.ejercicio3;

public abstract class Modo {

	public Mp3 mp3;
	
	public abstract String play(Mp3 mp3);

	public abstract String pause(Mp3 mp3);

	public abstract String stop(Mp3 mp3);
	
	public Mp3 getMp3() {
		return mp3;
	}

	public void setMp3(Mp3 mp3) {
		this.mp3 = mp3;
	}
}
