package ar.edu.unq.po2.tp4.ejercicio5;

public class PreguntasTeóricas {
	/*
	1)Habiendo definido la clase Persona y Mascota en Smalltalk,
	   no es posible ingresarlos a una Collection, porque es una 
	   clase abstracta, en tal caso habría que crear una Bag, un set,
	   una ordered collection, etc. Que tienen definidos sus 
	   métodos como add:>> with:>>, etc.

	4. Durante la iteración no hace falta distinguir si el 
		objeto es una Persona o Mascota para poder imprimir su 
		nombre.Este mecanismo se llama polimorfismo, ya que 
		distintos objetos saben responder los mismos mensajes. 
		Ojo, no es completo, ya que nomas saben responder 1 mensaje
		en común. En este caso, el getNombre.

	5.Tanto Mascota como Persona podrían responder los mismos 
	mensajes si heredaran de una Superclase su estructura y 
	comportamiento. Pero que pasa a la hora de responder los 
	mensajes que no tienen en común?. En caso de que Persona sea
	subclase de otra clase que no puede ser modificada por nosotros,
	podríamos crear una interfaz que comparta con Mascota, que nos 
	asegure que ambas clases van a responder el mismo mensaje 
	getNombre() o imprimirse. Por ejemplo:
	
	public interface Nombrable {
	public String getNombre();
	} 
	 * */
}
