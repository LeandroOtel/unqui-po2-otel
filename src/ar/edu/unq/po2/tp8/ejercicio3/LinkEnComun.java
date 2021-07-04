package ar.edu.unq.po2.tp8.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends Filtro{

	@Override
	protected void agregarSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page,
			WikipediaPage wikipediaPage) {
		if (compartenLink(page, wikipediaPage)) {
			paginasFiltradas.add(wikipediaPage);
		}
		
	}

	private boolean compartenLink(WikipediaPage page, WikipediaPage wikipediaPage) {
		return page.getLinks().stream().filter(wikipediaPage.getLinks()::contains).collect(Collectors.toList()).size() >= 1;
	}
}
