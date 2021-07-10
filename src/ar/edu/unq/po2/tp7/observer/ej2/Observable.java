package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.List;

public interface Observable {

	public void agregarServidor(Servidor nuevoServidor, List<String> intereses);
	public void registrar(Servidor servidor, String interes);
	public void notificarSuscriptores(Partido nuevoPartido);
}
