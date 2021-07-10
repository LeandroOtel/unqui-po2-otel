package ar.edu.unq.po2.tp7.observer.ej1;

import java.util.ArrayList;

public class Investigador implements Listener{
	private Observable sistemaDeReferencia;
	
	
	public Investigador(Observable sr) {
		this.sistemaDeReferencia = sr;
	}
	
	public void registrarse(ArrayList<String> temasDeInteres) {
		this.sistemaDeReferencia.agregarSuscriptor(this, temasDeInteres);
	}

	@Override
	public void nuevoArticulo(Observable sr, Articulo articulo) {
		/*no se aclara que debería pasar en esta implementacion, pero se podría corroborar
		//que el investigador este suscripto al SR, y si es el caso, mandarle un msj "nuevo
		//articulo". 
		 * También el investigador podría saber sus temas de interes, para no delegar
		 * tanto en el sistema de referencia, y cuando le llegue este msj contrastar si
		 * entre sus temas, estan los temas del articulo e informarse.
		 * */
	}
	
	public void subirArticulo(Articulo nuevoArticulo) {
		sistemaDeReferencia.agregarArticulo(nuevoArticulo);
	}
	
	
	

	public Observable getSistemaDeReferencia() {
		return sistemaDeReferencia;
	}

	public void setSistemaDeReferencia(Observable sistemaDeReferencia) {
		this.sistemaDeReferencia = sistemaDeReferencia;
	}
}
