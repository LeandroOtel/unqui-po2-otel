package ar.edu.unq.po2.tp4.ejercicio1;

public class ActividadDeLectura {
	/*1¿que ventajas en cuanto a polimorfismo, brindan las interfaces en java? 

		Las interfaces proveen mayor abstracción. Aquellas clases que implementen una misma
		interface, van a tener implementados los mensajes que indica la misma.
		Por ejemplo, si tenemos un Archivo y un Sticker, que ambos implementan la interface
		Imprimible y esta misma en su cuerpo tiene el método print(), ambas clases podran ser pasadas como 
		parametro en cualquier lugar que se necesite un Imprimible, ya que entienden el mensaje print().



	2¿por qué no siempre puedo utilizar clases abstractas para agrupar clases 
	polimórifcas?

		Las subclases deberían heredar todas las variables y metodos de la superclase
		entonces si entre las clases que se buscan agrupar tienen protocolos y comportamientos, 
		estructura diferentes (más cosas distintas que en común) no conviene 
		que se hereden de la misma clase abstracta. Ademas una clase solo puede
		heredar(extenderse) a una superclase, pero puede implementar varias interfaces.



	3¿que ventajas tienen las clases abstractas sobre interfaces?

		Las subclases de una clase abstracta heredan estructura y el comportamiento.
		Cosa que en la interface no. 
		
		Las subclases heredan protocolos, estructura y mensajes que reciben.
		La interfaz solamente le da un nivel más de abstraccion a las clases,
		que aseguran responder un mensaje en particular.



	4¿se puede instanciar una interface?

		No, al igual que si uno instancia una clase 
		abstracta.



	5¿por que no es recomendable incrementar o modificar las firmas definidas
	 en una interface?

		porque todos los objetos que las implementan va a saber responder esos
		 mensajes que tiene en su protocolo, es parte de su contrato. Al agregar
		 mensajes a la interface, todo aquel objeto que las implemente deberia 
		 saber responder estos nuevos mensajes.



	6. por que en smalltalk no es necesaria la implementacion de interfaces. 

		Smalltalk no es un lenguaje fuertemente tipado como Java. Con tan solo
		declarar un mensaje ya funciona para distintas implementaciones.
		Tambien se utilizan superclases que deciden si algún mensaje en 
		particular se va a delegar a su subclase (self subclass responsability)
		*/
}
