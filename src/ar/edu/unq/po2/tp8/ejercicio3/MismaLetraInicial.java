package ar.edu.unq.po2.tp8.ejercicio3;

import java.util.List;

public class MismaLetraInicial extends Filtro{
	
	protected void agregarSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page,
			WikipediaPage wikipediaPage) {
		if (mismaInicial(page, wikipediaPage)) {
			paginasFiltradas.add(wikipediaPage);
		}
		
	}

	private Boolean mismaInicial(WikipediaPage page, WikipediaPage wikipediaPage) {
		return page.getTitle().charAt(0) == (wikipediaPage.getTitle().charAt(0));
	}
}
