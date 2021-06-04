package ar.edu.unq.po2.tp6.poquer;



public class RespuestasTeoricas {
	/*
	2. ¿Cómo se indica en mockito que el objeto mock debe recibir un 
	secuencia de mensajes particular en un orden preestablecido? Agregue 
	un ejemplo.
	
	Con un mock Spy, controla
	el orden en que fueron enviados
	los mensajes
	
	String paloCarta = dobleCarta.getPalo();
	String colorCarta = dobleCarta.getColor();
		
	InOrder inOrder = Mockito.inOrder(dobleCarta);
	inOrder.verify(dobleCarta).getPalo();
	inOrder.verify(dobleCarta).getColor();
	
	

	
	3. ¿Cómo hacer para que un objeto mock este preparado para recibir 
	algunos mensajes sin importar el orden o la obligatoriedad de 
	recibirlos? Agregue un ejemplo.
	
	Con un mock stub, no hace falta
	indicar el orden en el cual los recibe
	
	
	
	
	
	
	4. Es posible anidar envío de mensajes con mockito. Si es posible, 
	como se hace.
	
	
	
	5. ¿Como es la forma de verificación con mockito?
	
	*verify
	*/
}
