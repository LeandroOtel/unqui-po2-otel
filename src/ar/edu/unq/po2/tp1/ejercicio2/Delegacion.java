package ar.edu.unq.po2.tp1.ejercicio2;

public class Delegacion {
	/*
	 * 2 – Delegación

		En una oficina hay un jefe que tiene un secretario el cual administra un fichero. Dadas las 
		siguientesimplementaciones seleccione la mejor alternativa y justifique.

		< Smalltalk />

		Opción 1)

		Jefe>>trabajarConFicha: unaFicha
		self secretario fichero buscar: unaFicha.

		Opción 2)

		Jefe>>trabajarConFicha: unaFicha 
		self secretario buscharEnFichero: unaFicha

		Secretario>>buscarEnFichero: unaFicha 
		self fichero buscar: unaFicha

		La opción 2 es la mejor alternativa, porque el jefe delega en su secretario el buscarEnFichero, 
		de lo contrario creo que se rompería el encapsulamiento
	 * */
}
