package ar.edu.unq.po2.tp6.Poquer;

import java.util.ArrayList;
import java.util.Arrays;

public class PoquerStatus {

	
	public String verificar(Carta a, Carta b, Carta c, Carta d, Carta e) {
		
		
		
		ArrayList<Carta> cartas= this.crearMano(a,b,c,d,e);
		
		if (this.verificarPoquer(cartas)) {
				return "Poquer";
				}
		else if (this.verificarColor(cartas)) {
				return "Color";
				}
		else if (this.verificarTrio(cartas)) {
				return "Trio";
				}
		
		else {return "Nada";}
		
	}
	
	
	
	
	private ArrayList<Carta> crearMano(Carta a, Carta b, Carta c, Carta d, Carta e) {
		ArrayList<Carta> mano = new ArrayList<Carta>(Arrays.asList(a,b,c,d,e));
		return mano;
	}




	public boolean verificarColor(ArrayList<Carta> cartas) {
		return cartas.stream().anyMatch(x-> this.tieneColor(x,cartas));
	}

	
	
	
	public boolean tieneColor(Carta c, ArrayList<Carta> cartas) {
		return cartas.stream()
				.filter(x -> x.esMismoColor(c))
				.count() == 5;
	}

	
	
	
	
	public boolean verificarPoquer(ArrayList<Carta> cartas) {
		
		return cartas.stream().anyMatch(x-> this.tienePoquer(x,cartas));
	}
	

	public boolean tienePoquer(Carta c, ArrayList<Carta> cartas) {
		
		return cartas.stream()
				.filter(x -> x.esMismoPalo(c))
				.count() >= 4;
	}

	
	
	
	
	public boolean verificarTrio(ArrayList<Carta> cartas) {
		return cartas.stream().anyMatch(x-> this.tieneTrio(x,cartas));
	}

	public boolean tieneTrio(Carta c, ArrayList<Carta> cartas) {
		return cartas.stream()
				.filter(x -> x.esMismoPalo(c))
				.count() == 3;
	}

}
