package ar.edu.unq.po2.tp8.ejercicio4;

public class RespuestasTeoricas {
	/*
	 * Template Method: 
	
	Costofinal(), nomas le hace falta ser un "final", asumo que no lo pusieron para que no fuera 
	obvia la respuesta. Asi no puede ser modificado, y todas las subclases deben respetar los 
	mensajes que estan en el mismo. En este caso, entender el mensaje costoNeto, esHoraPico, 
	getTiempo.
	
	Operaciones primitivas:
	public abstract boolean esHoraPico() -> operaciones abstractas
	
	Operaciones concretas esHoraPico() y costoNeto() -> Son implementadas en la clase concreta 
	
	Operaciones concretas Clase Abstracta: getHoraDelDia() y getTiempo() -> Operaciones de la clase abstracta que heredan las subclases.
	
	Hook:
	costoNeto() -> es el hook, porque tiene una definición estandar, pero luego es sobre escrito en la subclase
	*/
}
