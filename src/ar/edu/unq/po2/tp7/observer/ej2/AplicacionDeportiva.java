package ar.edu.unq.po2.tp7.observer.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AplicacionDeportiva {
	
	private Map<String, List<Listener>> suscriptores;
	private List<Partido> partidos;
	
	public AplicacionDeportiva(Map<String, List<Listener>> sus) {
		super();
		this.suscriptores = sus;
	}
	
	public void agregarServidor(Listener nuevoListener, List<String> intereses) {
		for (String interes : intereses) {
			this.registrar(nuevoListener,interes);
		}
	}
	
	public void registrar(Listener nuevoListener, String interes) {
		if(this.suscriptores.get(interes) == null) {
			this.suscriptores.put(interes, new ArrayList<Listener>());
		}
		this.suscriptores.get(interes).add(nuevoListener);
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
				
				{for (Listener interesados : this.suscriptores.get(interes))
				
					interesados.updatePartido(this, nuevoPartido);
				}
			
			else {
				this.suscriptores.put(interes, new ArrayList<Listener>());
				}
			}
	}

	public Map<String, List<Listener>> getSuscriptores() {
		return suscriptores;
	}

	public void setSuscriptores(Map<String, List<Listener>> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
}	
