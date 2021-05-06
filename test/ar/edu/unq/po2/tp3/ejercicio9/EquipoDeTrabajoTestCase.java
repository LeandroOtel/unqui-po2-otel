package ar.edu.unq.po2.tp3.ejercicio9;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EquipoDeTrabajoTestCase {

	private Persona pepe;
	private Persona lalo;
	private Persona mateo;
	private Persona mica;
	private Persona laura;
	private ArrayList<Persona> grupoPersonas;
	private EquipoDeTrabajo equipo1;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.pepe = new Persona("pepe", "p", 30);
		this.lalo = new Persona("lalo", "l", 24);
		this.mateo = new Persona("mateo", "m", 18);
		this.mica = new Persona("mica", "mi", 50);
		this.laura = new Persona("laura", "la", 33);
		grupoPersonas = new ArrayList<Persona>();
		grupoPersonas.add(pepe);
		grupoPersonas.add(lalo);
		grupoPersonas.add(mateo);
		grupoPersonas.add(mica);
		grupoPersonas.add(laura);
		this.equipo1 = new EquipoDeTrabajo("equipo1",grupoPersonas);
		
		
	}
	@Test
	void promedioEdades() {
		assertEquals(this.equipo1.promedioEdades(), 31);
	}

}
