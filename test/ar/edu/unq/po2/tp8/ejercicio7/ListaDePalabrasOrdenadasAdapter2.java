package ar.edu.unq.po2.tp8.ejercicio7;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial")
public class ListaDePalabrasOrdenadasAdapter2 extends DefaultListModel<String>{
	private ListaDePalabrasOrdenadas2 lista;
	
	public ListaDePalabrasOrdenadasAdapter2(ListaDePalabrasOrdenadas2 listaO) {
		this.lista = listaO;
	}
	
	@Override
	public void addElement(String element) {
		lista.agregarPalabra(element);
	}

	
}
