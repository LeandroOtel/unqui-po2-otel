package ar.edu.unq.po2.tp4.ejercicio4;

import ar.edu.unq.po2.tp4.ejercicio3.Cobrable;
import ar.edu.unq.po2.tp4.ejercicio3.Producto;

import java.util.ArrayList;

public class ColeccionadorDeObjetos {
	
	public Cobrable getFirstFrom(ArrayList<Cobrable> colecction) {
		return colecction.get(0);
	}
	
	public void addLast(Producto p1,ArrayList<Cobrable> colecction) {
		colecction.add(p1);
	}
}
