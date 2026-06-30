package Logica;

import java.util.*;

import Dominio.*;

import java.io.*;

public class GestorArchivo {
	private static GestorArchivo instancia;
	
	public GestorArchivo() {
		super();
	}

	public static GestorArchivo getInstanciaGestor() {
		if(instancia == null) {
			instancia = new GestorArchivo();
		}
		return instancia;
	}

	public void abrirArch(Sistema sys) throws FileNotFoundException {
		Scanner arch = new Scanner(new File("Sobres.txt"));
		while(arch.hasNextLine()) {
			String linea = arch.nextLine();
			String[] partes = linea.split(";");
			CartaFactory cFac = new CartaFactory();
			Carta carta = cFac.crearCarta(partes);
			sys.agregarCarta(carta);
		}
		arch.close();
		
	}

}
