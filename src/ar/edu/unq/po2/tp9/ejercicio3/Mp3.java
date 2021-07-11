package ar.edu.unq.po2.tp9.ejercicio3;

public class Mp3 {

	private Modo modo;
	private Song cancionActual;

	public Mp3(Song cancion){
	this.cancionActual= cancion;
	this.modo = new Seleccion(this);
	}
	
	public String play() {
		return this.modo.play(this);
}
	public String pause() {
		return this.modo.pause(this);
}
	public String stop() {
		return this.modo.stop(this);
}

	
	
	public void setModo(Modo nuevoModo){
	this.modo = nuevoModo;}

	public void setCancion(Song nuevaCancion){
	this.cancionActual = nuevaCancion;}

	public Song getSong(){
	return this.cancionActual;}
}
