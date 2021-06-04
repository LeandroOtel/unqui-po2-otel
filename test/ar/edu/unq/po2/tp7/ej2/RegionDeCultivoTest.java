package ar.edu.unq.po2.tp7.ej2;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.ej2.RegionDeCultivo;
import ar.edu.unq.po2.tp7.ej2.Soja;
import ar.edu.unq.po2.tp7.ej2.Trigo;


public class RegionDeCultivoTest {
	
	
	private RegionDeCultivo regionDeCultivo;
	private Soja s1;
	private Soja s2;
	private Trigo t1;
	private Trigo t2;
	
	@BeforeEach
	void setUp() throws Exception{
		this.regionDeCultivo = new RegionDeCultivo();
		this.s1 = new Soja();
		this.s2 = new Soja();
		this.t1 = new Trigo();
		this.t2 = new Trigo();
		}
	
	
	@Test
	void regionSubdividida2Soja2Trigo() {
		regionDeCultivo.agregarCultivo(s1);
		regionDeCultivo.agregarCultivo(s2);
		regionDeCultivo.agregarCultivo(t1);
		regionDeCultivo.agregarCultivo(t2);
		assertEquals(regionDeCultivo.gananciaAnual(), 400.0);
	}
	
}
