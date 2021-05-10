package ar.edu.unq.po2.tp4.ejercicio1;

public class ActividadDeLectura {
	/*1¿que ventajas en cuanto a polimorfismo, brindan las interfaces en java? 

		Proveen mayor abstracción.



	2¿por qué no siempre puedo utilizar clases abstractas para agrupar clases 
	polimórifcas?

		A veces si entre las clases tienen protocolos y comportamientos, 
		estructura diferentes (más cosas distintas que en común) no conviene 
		que se hereden de la misma clase abstracta.



	3¿que ventajas tienen las clases abstractas sobre interfaces?

		Las subclases heredan protocolos, estructura y mensajes que reciben.
		 La interfaz solamente le da un nivel más de abstraccion a las clases,
		 que aseguran responder un mensaje en particular.



	4¿se puede instanciar una interface?

		No, si varias clases se extienden a esa interfaz, instanciarla cual
		sería? creo que no se puede, al igual que si uno instancia una clase 
		abstracta.



	5¿por que no es recomendable incrementar o modificar las firmas definidas
	 en una interface?

		porque todos los objetos que las implementan va a saber responder esos
		 mensajes que tiene en su protocolo, es parte de su contrato. si se
		 cambian los objetos que las implementan van a seguir respondiendo los
		  mensajes tal cual estaban.



	6. por que en smalltalk no es necesaria la implementacion de interfaces. 

		mas que nada se utilizan superclases que deciden si algún mensaje en 
		particular se va a delegar a su subclase (self subclass responsability)
		*/
}
