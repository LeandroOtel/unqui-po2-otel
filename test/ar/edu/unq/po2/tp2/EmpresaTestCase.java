package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmpresaTestCase {

	private Temporal tem;
	private Permanente per;
	private Contratado cont;
	private Empresa emp;
	private ArrayList<Empleado> empleados;
	private ArrayList<ReciboDeHaberes> recibos;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.tem = new Temporal("nombre", "direc", true, LocalDate.of(1950, 05, 27), 20000.0, LocalDate.of(2050, 01, 11), 10);
		this.per = new Permanente("nombre", "direc", true, LocalDate.of(1950, 05, 27), 20000.0, 2, 10);
		this.cont = new Contratado("nombre", "direc", true, LocalDate.of(1950, 05, 27), 20000.0, 2, "cheque");
		this.empleados = new ArrayList<Empleado>();
		this.recibos = new ArrayList<ReciboDeHaberes>();
		empleados.add(per);
		empleados.add(tem);
		this.emp= new Empresa("n1",1234,this.empleados, recibos);
	}
	
	@Test
	void sueldoBrutoPermanente() {
		assertEquals(per.calcularSueldoBruto(),20900.0);
	}
	
	@Test
	void sueldoBrutoTemporal() {
		assertEquals(tem.calcularSueldoBruto(),20400.0);
	}
	
	@Test
	void retencionesPermanente() {
		assertEquals(per.calcularRetenciones(),5265.0);
	}
	
	@Test
	void retencionesTemporal() {
		assertEquals(tem.calcularRetenciones(),4155.0);
	}
	
	@Test
	void sueldoNetoPermanente() {
		assertEquals(per.calcularSueldoNeto(),15635.0);
	}
	
	@Test
	void sueldoNetoTemporal() {
		assertEquals(tem.calcularSueldoNeto(),16245.0);
	}
	
	@Test
	void sueldoBrutoEmpresa() {
		assertEquals(emp.montoTotalSueldosBruto(),41300.0);
	}
	
	@Test
	void sueldoNetoEmpresa() {
		assertEquals(emp.montoTotalSueldosNeto(),31880.0);
	}
	
	@Test
	void retencionesEmpresa() {
		assertEquals(emp.montoTotalRetenciones(),9420.0);
	}
	
	@Test
	void liquidar() {
		emp.liquidarSueldos();
		assertEquals(emp.getRecibos().size(),2);
	}
	
	@Test
	void liquidarVerPrimero() {
		emp.liquidarSueldos();
		assertEquals(emp.getRecibos().get(0).getSueldoBruto(),20900.0);
	}
	
	@Test
	void liquidarVerSegundo() {
		emp.liquidarSueldos();
		assertEquals(emp.getRecibos().get(1).getSueldoBruto(),20400.0);
	}
	
	@Test
	void sueldoBrutoContratado() {
		assertEquals(cont.calcularSueldoBruto(),20000.0);
	}
	
	@Test
	void liquidarContratado() {
		this.emp.liquidarSueldo(cont);
		assertEquals(emp.getRecibos().get(0).getRetenciones(),50.0);
	}


}
