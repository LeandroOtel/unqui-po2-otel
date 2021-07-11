package ar.edu.unq.po2.tp9.ejercicio2;

public abstract class EstadoMaquina {

		protected VideoJuego videoJuego;
	
		public abstract String presionarInicio(VideoJuego videoJuego);

		public abstract void ponerFicha(VideoJuego videoJuego);

		public VideoJuego getVideojuego() {
			return videoJuego;
		}

		public void setVideojuego(VideoJuego videojuego) {
			this.videoJuego = videojuego;
		}
		
		


}
