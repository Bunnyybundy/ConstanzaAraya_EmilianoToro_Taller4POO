package Logica;

import java.io.FileNotFoundException;
import java.util.List;

import Dominio.Carta;

public interface Sistema {
	
	
	void agregarCarta(Carta carta);
	
	void eliminarCarta(Carta carta);
	
	void modificarCarta(Carta carta);

	List<Carta> getCartas();
	
	void gestionarArch() throws FileNotFoundException;

}
