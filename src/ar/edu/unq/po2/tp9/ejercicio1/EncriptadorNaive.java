package ar.edu.unq.po2.tp9.ejercicio1;

public class EncriptadorNaive {
	
	private MetodoDeEncriptacion metodoDeEncriptacion;
	
	public EncriptadorNaive(MetodoDeEncriptacion metodo) {
		this.metodoDeEncriptacion = metodo;
	}
	
	public void setMetodoDeEncriptacion(MetodoDeEncriptacion metodo) {
		this.metodoDeEncriptacion = metodo;
	}
	
	public String encriptar(String texto) {
		return this.metodoDeEncriptacion.encriptar(texto);
	}

	public String desencriptar(String texto) {
		return this.metodoDeEncriptacion.desencriptar(texto);
	}
}
