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

	@Override
	public void agregarCarta(Carta carta) {
		cartas.add(carta);
		
	}

	@Override
	public void eliminarCarta(Carta carta) {
		for(Carta c : cartas) {
			if(c.getNombre().equals(carta.getNombre())) {
				cartas.remove(c);
			}
		}
		
	}

	@Override
	public void modificarCarta(Carta carta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carta> getCartas() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
