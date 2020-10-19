package ar.edu.unlam.pb2.clase;

import java.util.ArrayList;

public class Vuelos {
	private Integer idVuelos;
	private Integer cantAsientos;
	private String origen;
	private String destino;
	private ArrayList <Pasajero> listaDePasajeros;
	
	public Vuelos(Integer idVuelos, Integer cantAsientos, String origen, String destino) {
		this.destino = destino;
		this.origen = origen;
		this.cantAsientos = cantAsientos;
		this.idVuelos = idVuelos;
		this.listaDePasajeros = new ArrayList<Pasajero>();
	}

	public Integer getIdVuelos() {
		return this.idVuelos;
	}

	public Integer getCantAsientos() {
		return this.cantAsientos;
	}

	public String getOrigen() {
		return this.origen;
	}

	public String getDestino() {
		return this.destino;
	}
	
	public ArrayList<Pasajero> getListaDePasajeros() {
		return this.listaDePasajeros;
	}

	public boolean agregarPasajero(Pasajero nuevo) {
		//Opcion 1
		/*boolean resultado = true;
		for(Pasajero actual: listaDePasajeros) {
			if(actual.equals(nuevo)) {
				resultado = false;
				break;
			}
		}
		if(resultado == true) {
			listaDePasajeros.add(nuevo);
		}
		return resultado;
		*/
		//Opcion 2
		if(listaDePasajeros.contains(nuevo)) {
			return false;
		}else {
			return listaDePasajeros.add(nuevo);
		}
	}
	
	public Integer getCantidadPasajeros() {
		return listaDePasajeros.size();
	}
}
