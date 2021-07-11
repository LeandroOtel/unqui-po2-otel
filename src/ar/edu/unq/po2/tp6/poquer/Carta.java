package ar.edu.unq.po2.tp6.poquer;

public class Carta {
	
	private String valor;
	private String palo;
	private String color;
	
	
	public Carta(String v, String p, String c) {
		valor = v;
		palo = p;
		color = c;
	}
	
	
	public boolean esMismoPalo(Carta unaCarta) {
		return this.palo == unaCarta.getPalo();
	}
	
	public boolean esMayorQue(Carta unaCarta) {
		return this.valorNumerico() > unaCarta.valorNumerico();
	}
	

	public Integer valorNumerico() {
		if(valor.equals("J")) {return 11;}
		else if(valor.equals("Q")) {return 12;}
		else if(valor.equals("K")) {return 13;}
		else if(valor.equals("A")) {return 14;}
		else {return Integer.valueOf(valor);}
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}


	public boolean esMismoColor(Carta c) {
		return this.color.equalsIgnoreCase(c.getColor());
	}

}
