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
	    for(int i = 0; i < cartas.size(); i++) {
	        if(cartas.get(i).getNombre().equals(carta.getNombre())) {
	            cartas.remove(i);
	            break;
	        }
	    }
	}
	@Override
	public void modificarCarta(Carta carta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carta> getCartas() {
		return cartas;
	}
	

	
	
}
