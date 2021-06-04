package ar.edu.unq.po2.tp1.ejercicio4;

public class ActividadDeLectura {
	/*
	 * Actividad de lectura #1

		En el libro de Kent Beck Smalltalk Best Practices Patterns se discute la utilización de accessors.

		Lea las secciones Direct Variable Access e Indirect Variable Access que se encuentran al final de 
		esteTrabajo práctico.Luego responda a las siguientes preguntas:

		1.¿Qué significa el acceso directo a las variables? De un ejemplo.

		Es el ejercicio de usar las variables en TODOS los metodos que las requieran.
		En caso de tener clases con pocos métodos es conveniente, porque generar getters y setters 
		aumentaría mucho los métodos de la clase. Otro problema es si en al´gun momento se quieren cambiar 
		esas variables, habría que ir una por una.

		2.¿Qué significa el acceso indirecto a las variables? De un ejemplo.

		Implica el uso de métodos getters and setter para obtener las variables. Exige más metodos, y no 
		se lee tan fácil. Conviene cuando se escribe código con herencia, donde de una clase se desprenden 
		subclases. Hay que definir getters y setters para cada variable

		3.Qué ventajas y desventajas presenta cada estrategia referida a los getters y setters.Fragmento 
		del Libro: ​Smalltalk Best Practice Patterns​ de ​Kent Beck

		Por lo que entiendo hay unaa diferencia en cuanto a la seguridad, cuando algo es público es de 
		libre uso y cuando algo es private no sale de su clase.
	 * 
	 * 
	 * 
	 * Actividad de lectura 2

		¿en qué situación es conveniente utilizar el "Creation
		Parameter Method"?

		Lo que sugiere el texto es a la hora de crear un objeto, habiéndole pasado los parámetros, 
		en la implementación se cree el objeto y ahí mismo se llame a los setters para modificar sus 
		variables.

		Actividad de lectura 3

		¿cómo se debe proporcionar acceso a variables que
		referencian a una colección?

		Sugiere que los getting methods para las colecciones sean privados, que no todos los objetos 
		puedan tener acceso a las operaciones de colecciones (acceso restringido) para evitar 
		inconsistencias. Los mensajes que modifiquen una colección como por ejemplo quitar empleados de un 
		departamento deberán refrescar la memoria o cache de las variables que puedan llegar a haber 
		cambiado por ejemplo al quitar un empleado habría que actualizar el saldo total del departamento.
		" Collection Accessor Methods"

		La manera mas segura de generar acceso a elementos de una colección sería implementar un metodo que 
		ejecute un bloque por cada elemento en la colección.

		Actividad de lectura 4

		¿por qué son necesarios dos métodos para asignar el
		estado a una propiedad booleana?

		Porque con un solo método queda expuesto el estado booleano. */
}
