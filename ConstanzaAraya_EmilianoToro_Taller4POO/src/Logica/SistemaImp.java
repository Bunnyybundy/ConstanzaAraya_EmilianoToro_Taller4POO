package Logica;

import java.util.ArrayList;
import java.util.List;
import Dominio.*;

public class SistemaImp implements Sistema {  //antes se llamaba GestorColeccion lo cambie de nombre por comodidad
	private static Sistema instancia;
	private List<Carta> cartas;
	
	private SistemaImp() {
		this.cartas = new ArrayList<Carta>();
	}

	public static Sistema getInstancia() {
		if(instancia == null) {
			instancia = new SistemaImp();
		}
		return instancia;
	}
	public void agregarCarta(Carta carta) {
		cartas.add(carta);
		
		
	}
	public void eliminarCarta(Carta carta) {
		
	}
	public void modificarCarta(Carta carta) {
		
	}

	public List<Carta> getCartas() {
		return cartas;
	}
	
	
	
}
