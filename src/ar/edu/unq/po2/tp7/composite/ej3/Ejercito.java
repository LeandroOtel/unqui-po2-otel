package ar.edu.unq.po2.tp7.composite.ej3;
import ar.edu.unq.po2.punto.Punto;
import java.util.ArrayList;

public class Ejercito implements Caracter{
	
	private ArrayList<Caracter> ejercito;
	
	
	public Ejercito(ArrayList<Caracter> integrantes){
		super();
		this.ejercito = integrantes;
	}
	
	
	public void agregar(Caracter c) {
		this.ejercito.add(c);
	}
	
	
	public void quitar(Caracter c) {
		this.ejercito.remove(c);
	}
	
	public ArrayList<Caracter> getEjercito() {
		return this.ejercito;
	}
	
	@Override
	public void caminar(Punto punto) {
		for (Caracter c : ejercito)
		{c.caminar(punto);}
		
	}

}
