package ar.edu.unq.po2.tp7.observer.ej1;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaDeReferencias {
	
	private ArrayList<Articulo> articulos;
	private HashMap<String, ArrayList<Listener>> suscriptores;
	
	
	



	public SistemaDeReferencias() {
		this.setArticulos(new ArrayList<Articulo>());
		this.suscriptores=new HashMap<String, ArrayList<Listener>>();
	}
	
	
	public void agregarSuscriptor(Listener suscriptor, ArrayList<String> temasDeInteres) {
		for (String tema : temasDeInteres) {
			this.registrar(suscriptor,tema);
		}
	}
	
	public void registrar(Listener suscriptor, String tema) {
		if(this.suscriptores.get(tema) == null) {
			this.suscriptores.put(tema, new ArrayList<Listener>());
		}
		this.suscriptores.get(tema).add(suscriptor);
	}
	
	public void agregarArticulo(Articulo nuevoArticulo) {
		if(!this.articulos.contains(nuevoArticulo)){
			this.articulos.add(nuevoArticulo);
			this.notificarNuevoArticulo(nuevoArticulo);
		}
	}
		
	public void notificarNuevoArticulo(Articulo nuevoArticulo) {
		for (String criterio : nuevoArticulo.getCriterios())
			//tomo todos los criterios del nuevo articulo
			{if (this.suscriptores.containsKey(criterio))
				//si existe el c1, c2, c3 en mi lista de suscriptores,signfica
				//que hay listeners que esperan ver si hay nuevos articulos del tema
				{for (Listener investigador : this.suscriptores.get(criterio))
				//para cada investigador(listener) que este suscripto a ese tema, le informo
					investigador.nuevoArticulo(this, nuevoArticulo);
				}
			//si no estan suscriptos a algun tema, lo agrego el tema, sin listeners.
			else {
				this.suscriptores.put(criterio, new ArrayList<Listener>());
				}
			}
	}


	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}


	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
		
	}
	
	
	
	public HashMap<String, ArrayList<Listener>> getSuscriptores() {
		return suscriptores;
	}


	public void setSuscriptores(HashMap<String, ArrayList<Listener>> suscriptores) {
		this.suscriptores = suscriptores;
	}
}
