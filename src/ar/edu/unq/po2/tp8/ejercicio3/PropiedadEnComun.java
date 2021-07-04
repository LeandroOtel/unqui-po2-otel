package ar.edu.unq.po2.tp8.ejercicio3;

import java.util.List;

public class PropiedadEnComun extends Filtro{


	@Override
	protected void agregarSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page,
			WikipediaPage wikipediaPage) {
		if(compartenPropiedadesInfo(page, wikipediaPage)) {
			paginasFiltradas.add(wikipediaPage);
		}
		
	}

	private Boolean compartenPropiedadesInfo(WikipediaPage page, WikipediaPage wikipediaPage) {
		Boolean resultado = false;
		
		for (String key : page.getInfobox().keySet()) {
			resultado |= wikipediaPage.getInfobox().containsKey(key);
		}
		return resultado;
	}
}
