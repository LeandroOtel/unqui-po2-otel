package ar.edu.unq.po2.tp8.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class FiltroTestCase {

	private Filtro letraInicial;
	private Filtro linkEnComun;
	private Filtro propiedadEnComun;
	
	private Pagina p1;
	private Pagina p2;
	private Pagina p3;
	
	private List<WikipediaPage> listaDeWikipages;
	private List<WikipediaPage> links1;
	private List<WikipediaPage> links2;
	
	private Map<String, WikipediaPage> info1;
	private Map<String, WikipediaPage> info2;
	
	@BeforeEach
	public void setUp() {
		letraInicial = new MismaLetraInicial();
		linkEnComun = new LinkEnComun();
		propiedadEnComun = new PropiedadEnComun();
		
		p1 = mock(Pagina.class);
		p2 = mock(Pagina.class);
		p3 = mock(Pagina.class);
		
		listaDeWikipages = new ArrayList<WikipediaPage>();
		links1 = new ArrayList<WikipediaPage>();
		links2 = new ArrayList<WikipediaPage>();
		
		info1 = new HashMap<String, WikipediaPage>();
		info2 = new HashMap<String, WikipediaPage>();

	}
	
	@Test
	void mismaLetraInicial() {
		when(p1.getTitle()).thenReturn("POO");
		when(p2.getTitle()).thenReturn("POO");
		when(p3.getTitle()).thenReturn("ASD");
		listaDeWikipages.add(p2);
		listaDeWikipages.add(p3);
		
		List<WikipediaPage> paginasFiltradas = this.letraInicial.getSimilarPages(p1, listaDeWikipages);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(p2));
	}
	
	@Test
	void linkEnComun() {
		links1.add(p1);
		links1.add(p2);
		links2.add(p3);
		when(p1.getLinks()).thenReturn(links1);
		when(p2.getLinks()).thenReturn(links1);
		when(p3.getLinks()).thenReturn(links2);
		listaDeWikipages.add(p2);
		listaDeWikipages.add(p3);
		
		List<WikipediaPage> paginasFiltradas = this.linkEnComun.getSimilarPages(p1, listaDeWikipages);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(p2));
	}
	
	@Test
	void propiedadEnComun() {
		info1.put("tecnologia", p1);
		info1.put("ambiente", p1);
		info2.put("arte", p2);

		when(p1.getInfobox()).thenReturn(info1);
		when(p2.getInfobox()).thenReturn(info1);
		when(p3.getInfobox()).thenReturn(info2);
		listaDeWikipages.add(p2);
		listaDeWikipages.add(p3);
		
		List<WikipediaPage> paginasFiltradas = this.propiedadEnComun.getSimilarPages(p1, listaDeWikipages);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(p2));
	}

}
