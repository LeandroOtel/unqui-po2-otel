package ar.edu.unq.po2.tp3.ejercicio1;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Counter {
	private List<Integer> arregloDeEnteros = new ArrayList<Integer>();
	
	
	public List<Integer> numeros() {
		return this.arregloDeEnteros;
	}

	public void addNumber(int i) {
		this.arregloDeEnteros.add(i);
	}

	public int getEvenOcurrences() {
		List<Integer> numerosPares = arregloDeEnteros.stream().
				filter(numero->numero%2==0).
				collect(Collectors.toList());
		return numerosPares.size();
	}

	public int getOddOcurrences() {
		List<Integer> numerosImpares = arregloDeEnteros.stream().
				filter(numero->numero%2==1).
				collect(Collectors.toList());
		return numerosImpares.size();
	}

	public int multiplosDe(int i) {
		List<Integer> numerosImpares = arregloDeEnteros.stream().
				filter(numero->numero%i==0).
				collect(Collectors.toList());
		return numerosImpares.size();
	} 
}

