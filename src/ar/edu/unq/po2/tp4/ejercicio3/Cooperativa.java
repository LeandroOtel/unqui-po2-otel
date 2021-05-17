package ar.edu.unq.po2.tp4.ejercicio3;

public class Cooperativa extends Producto {
	
	private Double descuentoIva;
	
	
	
	
	
	public Cooperativa(String nombre, Double unPrecio,  int cantidad)
		{
		
		super(nombre, unPrecio, cantidad);
		
		descuentoIva = 10.00;

	}
	
	
	
	
	public void setDescuento(Double unPorcentaje) {
		descuentoIva = unPorcentaje;
	}
	
	public Double getDescuento() {
		return descuentoIva;
	}
	
	
	
	
	protected Double getPrecio() {
		return this.obtenerPrecio() - (this.obtenerPrecio()*descuentoIva/100);
	}
}
