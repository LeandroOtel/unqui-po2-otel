package ar.edu.unq.po2.tp4.ejercicio2;

public class Caja {
	
	
	private Double montoTotal;
	
	
	
	public Caja(){
		montoTotal = 0.0;

	}
	
	public void registrarProducto(Producto unProducto) {
		Double x = unProducto.getPrecio();
		unProducto.quitarUno();
		
		montoTotal = montoTotal + x;
	}
	
	public Double getMonto() {
		return(montoTotal);
	}
}
