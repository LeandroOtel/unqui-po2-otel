package ar.edu.unq.po2.tp9.ejercicio2;

public class VideoJuego {

		private int fichas;
		private EstadoMaquina estadoMaquina;

		public VideoJuego(){
		this.fichas = 0;
		this.estadoMaquina = new SinFichas();
}

		public int getFichas(){
		return this.fichas;
	}

		public String presionarInicio(){
		return this.estadoMaquina.presionarInicio(this);
	}

		public void ponerFicha(){
		this.estadoMaquina.ponerFicha(this); 
	}

		public void quitarFicha(){
		this.fichas--;
	}

		public void setEstadoMaquina(EstadoMaquina estado){
		this.estadoMaquina = estado;
	
		}
}
