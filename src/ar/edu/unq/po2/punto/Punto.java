package ar.edu.unq.po2.punto;

public class Punto {
	
	private float x;
	private float y;
	public Punto(float x, float y) {
		super();
<<<<<<< Upstream, based on branch 'main' of https://github.com/LeandroOtel/unqui-po2-otel.git
		this.setXY(x, y);
	}
	
	public void setXY(float x,float y) {
		this.setX(x);
		this.setY(y);
	}
	
=======
		this.x = x;
		this.y = y;
	}
>>>>>>> 3f78c26 Versión inicial
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
}
