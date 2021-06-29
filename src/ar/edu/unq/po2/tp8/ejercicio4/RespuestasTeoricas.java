package ar.edu.unq.po2.tp8.ejercicio4;

public class RespuestasTeoricas {
	/*
	 * Template Method: 
	
	Costofinal(), nomas le hace falta ser un "final", asumo que no lo pusieron para que no fuera 
	obvia la respuesta. Asi no puede ser modificado, y todas las subclases deben respetar los 
	mensajes que estan en el mismo. En este caso, entender el mensaje costoNeto, esHoraPico, 
	getTiempo.
	
	Operaciones primitivas:
	
	La clase abstracta, define operaciones primitivas que luego las clases concretas definiran 
	para implementar los pasos del algoritmo.En este caso, costoNeto que se encuentra en la clase 
	abstracta, es redefinido en la clase concreta y se encuentra dentro del esqueleto
	
	Operaciones concretas:
	
	getTiempo, getHoraDelDia. estan ya definidas en la clase abstracta, y son heredadas por las 
	subclases.
	
	
	Hook:
	esHoraPico(), porque no esta definido, o mas bien por defecto no hace nada. La subclase 
	seguramente cuando requiera hará un override del método*/
}
