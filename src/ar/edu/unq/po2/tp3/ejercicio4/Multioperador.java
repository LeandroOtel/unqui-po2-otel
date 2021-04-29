package ar.edu.unq.po2.tp3.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Multioperador {
	private ArrayList<Integer> arregloDeEnteros = new ArrayList<Integer>();
	
	private ArrayList<Integer> getEnteros() {
		return arregloDeEnteros;
		}

	public void addNumber(int i) {
		this.arregloDeEnteros.add(i);
		}

	public Integer sumarTodos() {
		Integer resultado = 0 ; 
		for (int i = 0; i< this.getEnteros().size(); i++) {
			resultado += this.getEnteros().get(i);
		}
		return resultado;
		}
		

	public Integer restarTodos() {
		Integer resultado = 0 ; 
		for (int i = 0; i< this.getEnteros().size(); i++) {
				resultado -= this.getEnteros().get(i);
			}
		return resultado;
		}
	
	public Integer multiplicarTodos() {
		Integer resultado = 1;
		for (int i= 0; i< this.getEnteros().size(); i++) {
			resultado *= this.getEnteros().get(i);
		}
		return resultado;
	}
}
