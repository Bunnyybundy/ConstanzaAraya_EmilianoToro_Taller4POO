package taller4;

import java.util.ArrayList;
import java.util.List;

public class GestorColeccion {
	private static GestorColeccion instancia;
	private List<Carta> cartas;
	
	private GestorColeccion() {
		this.cartas = new ArrayList<>();
	}

	public static GestorColeccion getInstancia() {
		if(instancia == null) {
			instancia = new GestorColeccion();
		}
		return instancia;
	}
	public void agregarCarta(Carta carta) {
		
	}
	public void eliminarCarta(Carta carta) {
		
	}
	public void modificarCarta(Carta carta) {
		
	}

	public List<Carta> getCartas() {
		return cartas;
	}
	
	
	
}
