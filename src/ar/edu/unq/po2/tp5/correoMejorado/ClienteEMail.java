package ar.edu.unq.po2.tp5.correoMejorado;

import java.util.ArrayList;

public class ClienteEMail {
	
	private Pop servidor;
	/*De esta manera, el clienteEMail guarda una Interface en su servidor, que 
	 * responde a los mensajes que le corresponden. Así la Interface 
	 * IServidor de antes queda dividida en sus dos responsabilidades.
	 * Si se llegara a implementar un nuevo tipo de Servidor, tendrá que implementar
	 * esta nueva interface Pop*/
	private String nombreUsuario;
	private String passusuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(Pop server, String nombreUsuario, String pass){
		this.servidor=server;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.servidor.conectar(this.nombreUsuario, this.passusuario);
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		//this.borrados.remove(correo);
		//esta última línea esta de más ya que existe el "eliminarBorrado"
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
