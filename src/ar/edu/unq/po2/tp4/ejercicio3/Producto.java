package ar.edu.unq.po2.tp4.ejercicio3;

public abstract class Producto implements Cobrable{
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
	
	
	protected Double obtenerPrecio() {
		return precio;
	}
	
	
	
	public void registrarEnCaja(Caja unaCaja) {
		Double x = this.getPrecio();
		
		unaCaja.addMonto(x);
		
		this.quitarUno();
		
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
