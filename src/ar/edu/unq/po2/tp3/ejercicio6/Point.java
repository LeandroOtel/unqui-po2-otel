package ar.edu.unq.po2.tp3.ejercicio6;

public class Point {

	private int x;
	private int y; 
	
	
	
	public Point() {
	super();
}
	
	
	public Point(int x, int y) {
	super();
	this.setXY(x, y);
}
	
	public int getX() {
		return x;
	}

	
	public void setX(int x) {
		this.x = x;
	}

	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	/*public Point(int x, int y) {
		super();
		this.setXY(x, y);
	}*/
	
	public void setXY(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void moverHasta(int x, int y) {
		this.setX(x);
		this.setY(y);
	}


	public Point sumarseCon(Point punto) {
		
		int x = this.getX() + punto.getX();
		int y = this.getY() + punto.getY();
		
		Point nuevoPunto = new Point(x,y);

		return nuevoPunto;
	}
}
