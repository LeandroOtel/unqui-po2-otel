package ar.edu.unq.po2.tp6.poquer;

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

	
	public String jugadaGanadora(Jugada mano1, Jugada mano2) {
		String resultadoJugada1 = this.verificar(mano1.getCartas().get(0), mano1.getCartas().get(1), 
				mano1.getCartas().get(2), mano1.getCartas().get(3), mano1.getCartas().get(4));
		
		String resultadoJugada2 = this.verificar(mano2.getCartas().get(0), mano2.getCartas().get(1), 
				mano2.getCartas().get(2), mano2.getCartas().get(3), mano2.getCartas().get(4));
		
		if (resultadoJugada1.equals(resultadoJugada2)) {
			return this.ganadorPorValor(mano1, mano2);
		} else {
			return this.ganadorEntre(resultadoJugada1, resultadoJugada2);
		}
	}
	
	private String ganadorEntre(String res1, String res2) {
		if (res1.equals("Poker")) {
			return "gana jugada 1";
		} else if (res2.equals("Poker")){
			return "gana jugada 2";
		} else if (res1.equals("Color")){
			return "gana jugada 1";
		} else if (res2.equals("Color")){
			return "gana jugada 2";
		} else if (res1.equals("Trio")){
			return "gana jugada 1";
		} else {
			return "gana jugada 2";
		}
	}
	
	private String ganadorPorValor(Jugada jugada1, Jugada jugada2) {
		int valorJugada1 = jugada1.getValorJugada();
		int valorJugada2 = jugada2.getValorJugada();
		
		if (valorJugada1 > valorJugada2) {
			return "gana jugada 1";
		} else {
			return "gana jugada 2";
		}
	}
	
}
