package ar.edu.unlam.pb2.clase;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSePuedaCrearUnaEmpresa() {
		Empresa aviacion = new Empresa("Lapa");
		
		assertNotNull(aviacion);
		assertEquals("Lapa",aviacion.getNombre());

	}
	
	@org.junit.Test
	public void queSePuedaCrearUnVuelo() {
		Integer idVuelos = 1;
		Integer cantidadAsientos = 1000;
		String origen = "Ezeiza";
		String destino = "Rio";
		
		Vuelos x = new Vuelos(idVuelos, cantidadAsientos, origen, destino);
		
		assertNotNull(x);
		assertEquals(idVuelos,x.getIdVuelos());
		assertEquals(cantidadAsientos,x.getCantAsientos());
		assertEquals(origen,x.getOrigen());
		assertEquals(destino,x.getDestino());
		assertNotNull(x.getListaDePasajeros());
		
	}
	
	@org.junit.Test
	public void queSePuedaAgregarUnPasajero() {
		Integer idVuelos = 1;
		Integer cantidadAsientos = 1000;
		String origen = "Ezeiza";
		String destino = "Rio";
		
		Pasajero andi = new Pasajero("Andres","Borgiat",41399474);
		Vuelos x = new Vuelos(idVuelos, cantidadAsientos, origen, destino);
		
		assertTrue(x.agregarPasajero(andi));
	}
	
	@org.junit.Test
	public void queNoSePuedaAgregarUnPasajeroRepetido() {
		Integer idVuelos = 1;
		Integer cantidadAsientos = 1000;
		String origen = "Ezeiza";
		String destino = "Rio";
		
		Pasajero andi = new Pasajero("Andres","Borgiat",41399474);
		Pasajero andi2 = new Pasajero("Andres","Borgiat",41399474);
		Vuelos x = new Vuelos(idVuelos, cantidadAsientos, origen, destino);
		
		assertTrue(x.agregarPasajero(andi));
		assertEquals((Integer)1,x.getCantidadPasajeros());
		assertFalse(x.agregarPasajero(andi2));
	}
}
