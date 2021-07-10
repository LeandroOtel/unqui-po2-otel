package ar.edu.unq.po2.tp8.ejercicio6;

import java.util.Enumeration;

public class RespuestasTeoricas {
	/*1)Existe más de un tipo de adaptadores, mencione y explique cada uno de ellos.
	 * 
	 * Class adapter usa herencia multiple para adaptar una interface a otra(adapter es una subclase de adaptee)
	 * Object adapter confia en la composicion del objeto. El adapter conoce a una instancia de adapttee a la cual
	 * le envía mensajes.


		2) en que se diferencian?
		Adaptador de clase: No funcionaría para adaptar una clase y sus subclases. Si bien puede sobre 
		escribir comportamiento del adaptee, ya que adapter es una subclase de adaptee.

		Adaptador de objeto: un adapter trabaja con varios adaptees. O sea, con el adaptee y todas sus 
		subclases. Tambien el adapter puede agregarle funcionalidad  a todos los adaptees de una. 
		Pero es más dificil sobreescribir el comportamiento del adaptee. Habría que subclasear el adaptee, y 
		hacer que el adapter refiera a una subclase más que al adaptee en si mismo.
		
		3)Si, en java se pueden utilizar ambos tipos de adapter. En el class adapter uno crea un adaptador
		que se extiende al adaptee, herendado sus metodos y propiedades. En el caso del object adapter, el 
		adaptador tiene una instancia del adaptee a la cual le pasa las request. Se puede usar ambos, porque 
		en java tenemos clases abstractas, herenda e interfaces.
		
		4)Interface Enumeration, clase Vector:
		el Vector con el método elements() devuelve Enumeration<E>, esto podría utilizar en cualquier lugar
		que se necesite un Enumeration<E>, vector tiene 2 métodos hasMoreElements y nextElement que son redefinidos.
		Esto permite utilizarlo como Enumaration, este sería el target, y el adaptado es el Vector
		
		5)ArrayList tiene un método iterator() que devuelve un Iterador<E>, este último sería el Target, porque
		ahora puede responder a esa interface, el adaptee es el ArrayList.
		
		

	 * */
}
