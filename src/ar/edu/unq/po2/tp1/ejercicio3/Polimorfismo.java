package ar.edu.unq.po2.tp1.ejercicio3;

public class Polimorfismo {
	/*
	 * 1)La CuentaBancaria debería delegar en sus subclases (self subclass responsability) la extracción. 
	 * Cada subclase debería saber como manejarse en caso de una extracción.
	No tiene sentido que se pregunten a sí mismas para confirmar que Clase son. En caso de agregar mas tipos
	de cuentas habría que poner mas IF.
	
	2)Pasa lo mismo que en el punto anterior: La CuentaBancaria debería delegar en sus subclases 
	(self subclass responsability) la extracción. Cada subclase debería saber como manejarse en caso de 
	una extracción.No tiene sentido tampoco agregar una colaborador tipo String que indique si es cuenta 
	corriente o caja de ahorro, porque cada subclase deberia saber como actuar frente a una extraccion.

	3)Si bien en este caso se delega el extraer a las subclases y se ve mejor que los antesriores (1,2)
	, aun se puede ver que existe algo de codigo repetido.

	4)Esta parece ser la mejor opcion. Evita el código repetido que hay en la opción anterior (3), se 
	delega el chequeoDeSaldoParaExtraccion a las subclases, y se unifica lo que ambas tenían en comun (saldo- unMonto)
	en la clase abstracta.
	 * */
}
