package ar.edu.unq.po2.tp8.ejercicio4;

public class RespuestasTeoricas {
	/*
	 * 
	
	*public abstract class LlamadaTelefonica {
		private int tiempo;
		private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	public int getTiempo(){			Operaciones concretas Clase Abstracta(la hereda la subclase)
	return this.tiempo;
	}
	
	public int getHoraDelDia(){			Operaciones concretas Clase Abstracta(la hereda la 
	return this.horaDelDia;				subclase)
	}
	
	public abstract boolean esHoraPico();	Operacion primitivas abstract
	
	public float costoFinal(){							Template Method
	
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	public float costoNeto(){
		return this.getTiempo()*1;			Hook, tiene una definición estandar. 
											Luego es sobrescrito en la subclase
	}
	
}

	public classLlamadaDescuento extends LlamadaTelefonica{
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}
	
	@Override
	public boolean esHoraPico() {			Operaciones concretas(implementacion)
		return false;
	}
	
	@Override
	public float costoNeto(){				Operaciones concretas(implementacion)
	return this.getTiempo()*0.95f;
	}
}
	*/
}
