package ar.edu.unq.po2.tp3.ejercicio9;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> equipo;
	
	public EquipoDeTrabajo(String unNombre, ArrayList<Persona> grupo) {
		nombre = unNombre;
		equipo = grupo;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getEquipo() {
		return equipo;
	}
	public void setEquipo(ArrayList<Persona> equipo) {
		this.equipo = equipo;
	}
	
	public int promedioEdades() {
		//int promedioDeEdades = 0;
		//for (Persona integrante : equipo)
		//	promedioDeEdades += integrante.getEdad();
		int promedioDeEdades = 
				equipo.stream().mapToInt(Persona->Persona.getEdad()).sum();
		return promedioDeEdades/equipo.size();
	}
}
