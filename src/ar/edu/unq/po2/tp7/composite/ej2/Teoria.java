package ar.edu.unq.po2.tp7.composite.ej2;

public class Teoria {
	/*
	 * 1. ¿Que impacto genera en su diseño el hecho de compartir instancias de parcelas entre composiciones?
	 *  Es decir, que la misma instancia se encuentre en más de una composición.
	 *  En caso de que un cultivo se encuentre total en una sola parcela, dara su precioAnual total
	 *  Ahora, si ese cultivo esta en una RegionDeCultivo, o sea que es una subparcela (esta adentro del composite)
	 *  Su precio se verá dividido en 4.
	 *  
	 *  3. Se debería recorrer la lista y por cada parcela preguntarle su gananciaAnual. Las parcelas totales
	 *  dan su valor total, y las regiones que estan subdivididas devuelven por cada una de sus subparcelas su 
	 *  gananciaAnual/4  
	 *
	 *
	 * 4. la operacion de agregador y quitado de hijos debera ser implementada por el composite, la clase compuesta.
	 * la hoja, leaf, o el objeto simple no debería poder hacer eso. O recibir esos mensajes y que no haga nada, pero
	 * se pone en juego la seguridad.
	 * 
	 * 5. Cultivo es el component,  el sistemaDeCultivos es el composite, el trigo y la soja son Leaf
	 */
}
