package ar.edu.unq.po2.tp7.composite.ej5;

public abstract class Product {
	private float price;
	private String name;
	
	public Product(String nombre, float precio) {
		this.price = precio;
		this.name = nombre;
	}
	
	
	public float getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}
