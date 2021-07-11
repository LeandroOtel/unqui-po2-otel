package ar.edu.unq.po2.tp6.poquer;

import java.util.ArrayList;

public class Jugada {
	
	private ArrayList<Carta> mano = new ArrayList<Carta>();
	
	public Jugada(ArrayList<Carta> nuevaMano) {
		this.mano = nuevaMano;
	}

	public ArrayList<Carta> getCartas() {
		return this.mano;
	}

	public int getValorJugada() {
		Integer total = 0;
		for (Carta carta : this.mano) {
			total += carta.valorNumerico();
		}
		return total;
	}
}
