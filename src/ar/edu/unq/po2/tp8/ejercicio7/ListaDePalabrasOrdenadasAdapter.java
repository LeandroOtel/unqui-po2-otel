package ar.edu.unq.po2.tp8.ejercicio7;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial")
public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{
	private ListaDePalabrasOrdenadas lista;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas listaO) {
		this.lista = listaO;
	}
	
	@Override
	public void addElement(String element) {
		lista.agregarPalabra(element);
	}
}
