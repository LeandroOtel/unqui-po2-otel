package ar.edu.unq.po2.tp7.ej3;

public class Ingeniero implements Caracter{

	private Integer lajas;
	
	
	public Ingeniero(Integer i) {
		super();
		this.setLajas(i);
	
	}
	
	
	
	
	public void setLajas(Integer i) {
		this.lajas = i;
		
	}
	
	
	
	public Integer getLajas() {
		return lajas;
	}
	
	@Override
	public void caminar(Punto punto) {
		/*Al caminar de un punto a otro lo hace de la forma más corta posible.
		Mientras lo hace va construyendo un camino. Para construirlo va
		dejando en el piso lajas que contiene en una bolsa. Las lajas son finitas,
		por lo cual las coloca solamente si en el camino no han colocado alguna
		laja antes. Cuando se terminan sus lajas, camina normalmente.*/
		
	}
	
	

}
