package ar.edu.unq.po2.tp8.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaCultivosTest {

private SistemaCultivos sistemaDeCultivos;
private RegionDeCultivo regionDeCultivo;
private Trigo t1;
private Trigo t2;
private Trigo t3;
private Trigo t4;
private Soja s1;
private Soja s2;
private Soja s3;
private Soja s4;
	
	@BeforeEach
	void setUp() throws Exception{
		this.sistemaDeCultivos = new SistemaCultivos();
		this.regionDeCultivo = new RegionDeCultivo();
		this.t1 = new Trigo();
		this.t2 = new Trigo();
		this.t3 = new Trigo();
		this.t4 = new Trigo();
		this.s1 = new Soja();
		this.s2 = new Soja();
		this.s3 = new Soja();
		this.s4 = new Soja();
		
		regionDeCultivo.agregarCultivo(t1);
		regionDeCultivo.agregarCultivo(t2);
		regionDeCultivo.agregarCultivo(t3);
		regionDeCultivo.agregarCultivo(t4);
		sistemaDeCultivos.agregarCultivoAlSistema(s1);
		sistemaDeCultivos.agregarCultivoAlSistema(s2);
		sistemaDeCultivos.agregarCultivoAlSistema(s3);
		sistemaDeCultivos.agregarCultivoAlSistema(s4);
		}
		
	@Test
	void sistemaDe4TrigosSimplesY4SojasSubdivididas() {
		sistemaDeCultivos.agregarCultivoAlSistema(regionDeCultivo);
		assertEquals(this.sistemaDeCultivos.sumarGanancias(), 2300.0);
	}
	
	
	@Test
	void sistemaDe4SojasSimples() {
		assertEquals(this.sistemaDeCultivos.sumarGanancias(), 2000.0);
	}

}
