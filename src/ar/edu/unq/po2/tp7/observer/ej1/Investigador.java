package ar.edu.unq.po2.tp7.observer.ej1;

import java.util.ArrayList;

public class Investigador implements Listener{
	private SistemaDeReferencias sistemaDeReferencia;
	
	
	public Investigador(SistemaDeReferencias sr) {
		this.sistemaDeReferencia = sr;
	}
	
	public void registrarse(ArrayList<String> temasDeInteres) {
		this.sistemaDeReferencia.agregarSuscriptor(this, temasDeInteres);
	}

	@Override
	public void nuevoArticulo(SistemaDeReferencias sr, Articulo articulo) {
		/*no se aclara que debería pasar en esta implementacion, pero se podría corroborar
		//que el investigador este suscripto al SR, y si es el caso, mandarle un msj "nuevo
		//articulo". 
		 * También el investigador podría saber sus temas de interes, para no delegar
		 * tanto en el sistema de referencia, y cuando le llegue este msj contrastar si
		 * entre sus temas, estan los temas del articulo e informarse.
		 * La desventaja sería que se le notifica a TODOS los listener por igual, y
		 * quizas muchos de ellos no esten interesados en el tema. Teniendo los intereses
		 * en el sistema de referencia, solamente notificamos a aquellos que esten interesados.
		 * */
	}
	
	public void subirArticulo(Articulo nuevoArticulo) {
		sistemaDeReferencia.agregarArticulo(nuevoArticulo);
	}
	
	
	

	public SistemaDeReferencias getSistemaDeReferencia() {
		return sistemaDeReferencia;
	}

	public void setSistemaDeReferencia(SistemaDeReferencias sistemaDeReferencia) {
		this.sistemaDeReferencia = sistemaDeReferencia;
	}
}
