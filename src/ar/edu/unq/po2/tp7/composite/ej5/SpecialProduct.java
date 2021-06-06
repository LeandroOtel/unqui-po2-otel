package ar.edu.unq.po2.tp7.ej5;

public class SpecialProduct extends Product{

	
	public SpecialProduct(String nombre, float precio) {
		super(nombre, precio);
		
	}
	//el getPrice() lo va a ir a buscar a su superClase. Como no sabemos
	//que es lo que hace en la implementación, no lo agrego acá.
	//ahora si hiciera algún descuento, tendría que hacer un override
	// y seria protected.
	
}
