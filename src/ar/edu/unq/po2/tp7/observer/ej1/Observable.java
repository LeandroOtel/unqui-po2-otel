package ar.edu.unq.po2.tp7.observer.ej1;

import java.util.ArrayList;
import java.util.HashMap;

public interface Observable {
		
	public void agregarSuscriptor(Listener suscriptor, ArrayList<String> temasDeInteres);
	public void registrar(Listener suscriptor, String tema);
	public void notificarNuevoArticulo(Articulo nuevoArticulo);
	public HashMap<String, ArrayList<Listener>> getSuscriptores();
}
