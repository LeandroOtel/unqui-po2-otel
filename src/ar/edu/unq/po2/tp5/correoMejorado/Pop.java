package ar.edu.unq.po2.tp5.correoMejorado;

import java.util.List;

public interface Pop {

	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
}
