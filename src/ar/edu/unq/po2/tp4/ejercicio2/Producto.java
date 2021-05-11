package ar.edu.unq.po2.tp4.ejercicio2;

public abstract class Producto {
	private String nombre;
	private Double precio;
	private int stock;
	
	public Producto(String nombreProducto, Double precioProducto, int cantidad) {
		nombre = nombreProducto;
		precio = precioProducto;
		stock = cantidad;

	}
	
	protected Double getPrecio() {
		return this.obtenerPrecio();
	}
	
	
	public Double obtenerPrecio() {
		return precio;
	}
	
	
	
	
	public void setPrecio(Double unPrecio) {
		this.precio = unPrecio; 
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setStock(int cantidad) {
		stock = cantidad; 
	}
	
	public int getStock() {
		return stock;
	}
	
	public void quitarUno() {
		this.stock = this.stock - 1;
	}


}
