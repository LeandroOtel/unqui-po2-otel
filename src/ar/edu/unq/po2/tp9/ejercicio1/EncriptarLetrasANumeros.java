package ar.edu.unq.po2.tp9.ejercicio1;

import java.util.ArrayList;


public class EncriptarLetrasANumeros extends MetodoDeEncriptacion{

	@Override
	public String encriptar(String texto) {
		//lo hice con 3 letras nomas porque eran muchas, no encontre una manera más sencilla de hacerlo
		//que no fuera poner 1 por 1 las letras y sus respectivos numeros.
		texto = texto.replace("a", "1,")
				.replace("b", "2,")
				.replace("c", "3,");

		return texto;
	}
	
	@Override
	public String desencriptar(String texto) {
		texto = texto.replace("1,","a")
				.replace("2,","b")
				.replace("3,","c");

		return texto;
	} 
}
