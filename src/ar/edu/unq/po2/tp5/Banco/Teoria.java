package ar.edu.unq.po2.tp5.Banco;

public class Teoria {
	/*
	 * El modelo cumple con los principios Solid vistos en clase
	 * 
	 * Cada clase tiene su única responsabilidad (Single class responsability)
	 * El banco registra y evalua solicitudes, los clientes solicitan creditos, 
	 * las solicitudes de credito realizan su chequeo.
	 * 
	 * Las clases CreditoPersonal y CreditoHipotecario son subclases de Credito
	 * porque tienen estructura y mensajes en común, nomas varían una implementación
	 * Entonces cualquiera de las dos que se utilice donde se requiera un Credito va a funcinar
	 * (Liskov substitution)
	 * 
	 * Open closedPrinciple, ya que se utilizan interfaces como SolicitudDeCredito e IBanco
	 * por si el dia de mañana se cambian los objetos concretos, deberían seguir manteniedno los protocolos.
	 * 
	 * Las interfaces son lo más simple posibles, no tienen mensajes de mas (Interface segregation)
	 * 
	 * Dependency Inversion : Existe la clase abstract credito, y cuando el dia de mañana aparezca un nuevo tipo
	 * de credito, deberea extenderse a esta clase abstracta y tener su propia implementacion de realizarChequeo
	 * 
	 * 
	 * */
}
