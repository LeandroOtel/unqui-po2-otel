package ar.edu.unq.po2.tp9.ejercicio1;


public class EncriptarVocales extends MetodoDeEncriptacion{

	@Override
	public String encriptar(String texto) {
		texto = texto
			.replace("a", "1")
			.replace("e", "2")
			.replace("i", "3")
			.replace("o", "4")
			.replace("u", "5")
			.replace('1', 'e')
			.replace("2", "i")
			.replace("3", "o")
			.replace("4", "u")
			.replace("5", "a");
		//primero lo paso a numeros, luego esos numeros a las letras que corresponden.
		//porque si nomas reemplazaba por las letras correspondientes fallaba
		// a->e, e->i, i->o, o->u, u->a entonces todas las letras terminaban en U
		return texto;
	}
	
	@Override
	public String desencriptar(String texto) {
		texto = texto
			.replace("a", "1")
			.replace("e", "2")
			.replace("i", "3")
			.replace("o", "4")
			.replace("u", "5")
			.replace("1", "u")
			.replace("2", "a")
			.replace("3", "e")
			.replace("4", "i")
			.replace("5", "o");
		return texto;
	}
}
