package ar.edu.unq.po2.tp7.composite.ej5;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	
	private List<Product> elementos;
	
	public CarroDeCompras() {
		super();
		this.elementos = new ArrayList<Product>();
	}
	
	public List<Product> getElements(){
		return elementos;
	}
	
	public int totalRounded() {
		int total = 0;
		for (Product p : elementos) {
			total += Math.round(p.getPrice());
		}
		return total;
	}
	
	public float total() {
		float total = 0;
		for (Product p : elementos) {
			total += p.getPrice();
		}
		return total;
	}
	
	public void setElements(List<Product> nuevaLista) {
		this.elementos = nuevaLista;
		
	}
}
