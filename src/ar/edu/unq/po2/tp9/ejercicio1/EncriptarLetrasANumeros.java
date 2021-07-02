package ar.edu.unq.po2.tp9.ejercicio1;

import java.util.ArrayList;


public class EncriptarLetrasANumeros extends MetodoDeEncriptacion{

	@Override
	public String encriptar(String texto) {
		char[] charArray = texto.toCharArray();
		String textoEncriptado = "";
		int numero = 0;
		for (char ch : charArray){
		numero = ch;
		//textoEncriptado + numero + ",";
		} 

		return textoEncriptado;
	}
	
	@Override
	public String desencriptar(String texto) {
		String[] textoParaDesencriptar = texto.split(",");
		String textoDesencriptado = "";
		char letra = 'a';
		for (String string : textoParaDesencriptar){
		//letra = Integer.parseInt(string);;
		//textoDesencriptado + letra;
		} 

		return textoDesencriptado;
	}
}
