package ar.edu.unq.po2.tp7.observer.ej1;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	private String titulo;
	private String autor;
	private String filiacion;
	private String tipo;
	private String lugar;
	private String palabraClave;
	
	
	public Articulo(String tit, String a, String f, String tip, String l, String p) {
		this.titulo = tit;
		this.tipo = tip;
		this.autor = a;
		this.filiacion = f;
		this.lugar = l;
		this.palabraClave = p;
		
	}
	
	
	public List<String> getCriterios(){
		
		List<String> criterios = new ArrayList<String>();
		
		criterios.add(this.getAutor());
		criterios.add(this.getFiliacion());
		criterios.add(this.getLugar());
		criterios.add(this.getPalabraClave());
		criterios.add(this.getTipo());
		criterios.add(this.getTitulo());
		
		return criterios;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFiliacion() {
		return filiacion;
	}
	public void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getPalabraClave() {
		return palabraClave;
	}
	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	
}
