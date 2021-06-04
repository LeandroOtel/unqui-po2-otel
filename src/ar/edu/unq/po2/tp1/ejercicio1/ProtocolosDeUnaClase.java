package ar.edu.unq.po2.tp1.ejercicio1;

public class ProtocolosDeUnaClase {
	/*Evaluación de protocolos de una clase

	Sea la clase Rectángulo con 4 variables de instancia (​esquinaSuperiorIzquierda​,esquinaSuperiorDerecha​, 
	esquinaInferiorIzquierda​ y ​esquinaInferiorDerecha​). Elija uno de los protocolos presentados a 
	continuación y justifique su elección. Recuerde que el protocolo es el conjunto de mensajes que entiende 
	una clase o tipo.

	< Smalltalk />

	Opción 1)

	Class Rectangulo>>new
	Rectangulo>>esquinaSuperiorIzquierda: unPunto
	Rectangulo>>esquinaSuperiorDerecha: unPunto
	Rectangulo>>esquinaInferiorIzquierda: unPunto
	Rectangulo>>esquinaInferiorDerecha: unPunto

	Opción 2)

	Class Rectangulo>>newEnOrigenEsquinaSuperiorIzquierda:unPunto alto:unNumero 
	ancho:unNumeroRectangulo>>reubicarEsquinaSuperiorIzquierdaEn: unPunto
	Rectangulo>>ancho: unNumero
	Rectangulo>>alto: unNumero

	Es más conveniente la segunda opción. Según la consigna crea un rectángulo por ende tiene 2 lados a y 
	2 lados b que serán iguales, en caso de tener una variable de instanca para cada lado se prestaría a un 
	posible error o confusión, por ejemplo crear lados que deberían ser iguales de diferente tamaño
	
	*/
}
