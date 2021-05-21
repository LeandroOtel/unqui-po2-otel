package ar.edu.unq.po2.tp5.Banco;

public class Propiedad {
	
	
	
	private String descripcion;
	private String direccion;
	private float valorFiscal;
	
	
	
	
	public Propiedad(String desc, String dir, float valor) {
		descripcion = desc;
		direccion = dir;
		valorFiscal = valor;
		
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public float getValorFiscal() {
		return valorFiscal;
	}




	public void setValorFiscal(float valorFiscal) {
		this.valorFiscal = valorFiscal;
	}





}
