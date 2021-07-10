package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AplicacionDeportiva implements Observable{
	private Map<String, List<Servidor>> suscriptores;
	private List<Partido> partidos;
	
	public AplicacionDeportiva(Map<String, List<Servidor>> sus) {
		super();
		this.suscriptores = sus;
	}
	
	public void agregarServidor(Servidor nuevoServidor, List<String> intereses) {
		for (String interes : intereses) {
			this.registrar(nuevoServidor,interes);
		}
	}
	
	public void registrar(Servidor servidor, String interes) {
		if(this.suscriptores.get(interes) == null) {
			this.suscriptores.put(interes, new ArrayList<Servidor>());
		}
		this.suscriptores.get(interes).add(servidor);
	}
	
	public void agregarPartido(Partido partidoNuevo) {
		if(!this.partidos.contains(partidoNuevo)){
			this.partidos.add(partidoNuevo);
			this.notificarSuscriptores(partidoNuevo);
			}
	}
	
	public void notificarSuscriptores(Partido nuevoPartido) {
		for (String interes : nuevoPartido.getInformacion())
			
			{if (this.suscriptores.containsKey(interes))
				
				{for (Servidor interesados : this.suscriptores.get(interes))
				
					interesados.updatePartido(this, nuevoPartido);
				}
			
			else {
				this.suscriptores.put(interes, new ArrayList<Servidor>());
				}
			}
	}

	public Map<String, List<Servidor>> getSuscriptores() {
		return suscriptores;
	}

	public void setSuscriptores(Map<String, List<Servidor>> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
}	
