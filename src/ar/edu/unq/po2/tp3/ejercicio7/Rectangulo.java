package ar.edu.unq.po2.tp3.ejercicio7;

import ar.edu.unq.po2.tp3.ejercicio6.Point;

public class Rectangulo {
	
	
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;
	
	
	
	
	private Integer alto;
	private Integer ancho;
	
	
	
	
	public Rectangulo(Point p, Integer y, Integer x) {
		
		esquinaInferiorIzquierda = p;
		
		
		esquinaSuperiorIzquierda = new Point(p.getX(), p.getY()+y);
		
		
		esquinaSuperiorDerecha = new Point(p.getX()+x, p.getY()+y);
		
		
		esquinaInferiorDerecha = new Point(p.getX()+x, p.getY());
		
		alto = y;
		
		ancho = x;
		
	}
	
	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}
	
	
	public void setEsquinaSuperiorIzquierda(Point x) {
		this.esquinaSuperiorIzquierda = x;
	}
	
	
	
	
	
	
	
	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}
	
	
	
	
	
	public void setEsquinaSuperiorDerecha(Point x) {
		this.esquinaSuperiorDerecha = x;
	}
	
	
	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}
	
	
	
	
	
	public void setEsquinaInferiorIzquierda(Point x) {
		this.esquinaInferiorIzquierda = x;
	}
	
	
	
	
	
	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}
	
	
	public void setEsquinaInferiorDerecha(Point x) {
		this.esquinaInferiorDerecha = x;
	}
	
	
	public Integer getAlto() {
		return alto;
	}
	
	
	
	
	
	
	
	public void setAlto(Integer alto) {
		this.alto = alto;
	}
	
	
	
	
	
	public Integer getAncho() {
		return ancho;
	}
	
	
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
	
	
	
	
	
	
	public int area() {
		return alto * ancho;
	}
	
	
	
	
	
	
	public int perimetro() {
		return (2*alto) + (2* ancho);
	}
	
	
	
	
	
	public String tipo() {
		
		String tipo = new String();

		if (ancho > alto) {tipo = "horizontal";}
		else tipo = "vertical";
		return tipo;
	}
}
