package ar.edu.unq.po2.tp5.Banco;

import java.util.ArrayList;


public class Banco implements IBanco{
	ArrayList<Cliente> clientes;
	ArrayList<SolicitudDeCredito> solicitudes;
	
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
		solicitudes = new ArrayList<SolicitudDeCredito>();
		
	}
	
	
	
	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}



	public void registrarSolicitud(SolicitudDeCredito s) {
		solicitudes.add(s);
		
	}
	
	
	
	public void evaluarSolicitud(SolicitudDeCredito s) {
		Boolean cumpleRequisitos = s.realizarChequeo();
		
		if (cumpleRequisitos) {
			this.pagarleAlCliente(s);
			}
		
	}


	public float montoTotalDeDineroADesembolsar() {
		float total = 0;
		for (SolicitudDeCredito s : solicitudes) {
			total += s.getMonto();
		}

		return total;
	}

	@SuppressWarnings("unused")
	private void desembolsarMontoPara(SolicitudDeCredito s) {
		//esto debería quitar del banco el monto de la solicitud
	}

	private void pagarleAlCliente(SolicitudDeCredito s) {
		//esto debería depositar un monto en el cliente que su solicitud
		//fue aprobada.
		
	}
	
	
}
