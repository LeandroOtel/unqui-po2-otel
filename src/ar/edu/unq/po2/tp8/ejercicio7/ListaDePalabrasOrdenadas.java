package ar.edu.unq.po2.tp8.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaDePalabrasOrdenadas {
	private List<String>palabras;
	

	
	
	public ListaDePalabrasOrdenadas(){
	this.palabras=new ArrayList<String>();
	//this.comparador=new Comparator();
	}
	public int compare(Object palabraA, Object palabraB) {
	String a=((String)palabraA);
	String b=(((String)palabraB));
	return a.compareToIgnoreCase(b);
}

	

	public void agregarPalabra(String palabra){
	this.palabras.add(palabra);
	Collections.sort(this.palabras);//, this.comparador
	}
	
	public Integer cantidadDePalabras(){
	return this.palabras.size();
	}
	
	public String getPalabraDePosicion(int posicion){
	return this.palabras.get(posicion);
	}
}
