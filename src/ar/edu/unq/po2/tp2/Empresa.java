package ar.edu.unq.po2.tp2;

import java.util.List;

public class Empresa {
	
	private String nombre;
	private Integer cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibos;
	
	public Empresa(String nom, Integer c, List<Empleado> emp, List<ReciboDeHaberes> rec) {
		this.nombre = nom;
		this.cuit = c;
		this.empleados = emp;
		this.recibos = rec;
	}
	
	public Double montoTotalSueldosNeto() {
		Double total = 0.0;
		for(Empleado emp : empleados) {
			total += emp.calcularSueldoNeto();
		}
		return total;
	}
	public Double montoTotalSueldosBruto() {
		Double total = 0.0;
		for(Empleado emp : empleados) {
			total += emp.calcularSueldoBruto();
		}
		return total;
	}
	public Double montoTotalRetenciones() {
		Double total = 0.0;
		for(Empleado emp : empleados) {
			total += emp.calcularRetenciones();
		}
		return total;
	}
	
	

	public void liquidarSueldos() {
		for(Empleado emp : empleados) {
			this.liquidarSueldo(emp);
		}
	}
	
	public void liquidarSueldo(Empleado emp) {
		ReciboDeHaberes recibo = new ReciboDeHaberes(emp);
		this.recibos.add(recibo);
		}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<ReciboDeHaberes> recibos) {
		this.recibos = recibos;
	}
}


