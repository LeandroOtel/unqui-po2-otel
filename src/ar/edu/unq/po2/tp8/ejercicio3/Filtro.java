package ar.edu.unq.po2.tp8.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		//template method
		List<WikipediaPage> paginasFiltradas = new ArrayList<WikipediaPage>();
		for (WikipediaPage wiki : wikipedia) {
			this.agregarSiPasaElFiltro(paginasFiltradas, page, wiki);
		}
		return paginasFiltradas;
	}

	protected abstract void agregarSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page,
			WikipediaPage wikipediaPage);
	//operacion primitiva
}
