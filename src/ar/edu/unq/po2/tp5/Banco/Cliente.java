package ar.edu.unq.po2.tp5.Banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private float sueldoNeto;
	private Propiedad propiedad;
	
	
	
	
	
	public Cliente(String n, String a, String d, int e, float s, Propiedad p) {
		nombre = n;
		apellido = a;
		direccion = d;
		edad = e;
		sueldoNeto = s;
		propiedad = p; 
		
	}
	
	
	
	public float calcularSueldoAnual() {
		return sueldoNeto*12;
	}
	
	public void solicitarCredito(SolicitudDeCredito s, Banco b) {
		b.registrarSolicitud(s);
	}
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public float getSueldoNeto() {
		return sueldoNeto;
	}



	public void setSueldoNeto(float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}



	public Propiedad getPropiedad() {
		return propiedad;
	}



	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}


}
