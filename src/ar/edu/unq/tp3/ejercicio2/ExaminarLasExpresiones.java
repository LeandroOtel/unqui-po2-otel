package ar.edu.unq.tp3.ejercicio2;

public class ExaminarLasExpresiones {
	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;
		System.out.print(a); //abc
		System.out.print(s.length()); //  3
		//System.out.print(t.length()); no funciona porque t no tiene elementos
		System.out.print(a + 1); //  1abc
		System.out.print(a.toUpperCase()); //ABC
		System.out.print("Libertadr".indexOf("r")); //Si la letra no esta devuelve -1, si aparece más de 1 vez te devuelve la primera aparición
		System.out.print("Quilmes".substring(2,4)); // il
		System.out.print((a.length() + a).startsWith("a"));//false
		System.out.print(s == a); //true
		System.out.print(a.substring(1,3).equals("bc")); //true
	}
}
