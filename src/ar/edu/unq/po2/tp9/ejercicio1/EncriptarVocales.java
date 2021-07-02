package ar.edu.unq.po2.tp9.ejercicio1;


public class EncriptarVocales extends MetodoDeEncriptacion{

	@Override
	public String encriptar(String texto) {
		texto = texto
			.replace("a", "e")
			.replace("e", "i")
			.replace("i", "o")
			.replace("o", "u")
			.replace("u", "a");
		return texto;
	}
	
	@Override
	public String desencriptar(String texto) {
		texto = texto
			.replace("a", "u")
			.replace("e", "a")
			.replace("i", "e")
			.replace("o", "i")
			.replace("u", "o");
		return texto;
	}
}
