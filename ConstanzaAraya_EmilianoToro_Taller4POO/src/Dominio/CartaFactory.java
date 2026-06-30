package Dominio;

public class CartaFactory {
	

	public Carta crearCarta(String[] partes) {
		String nombre = partes[0];
		String rareza = partes[1];
		String tipo = partes[2];
		String rutaImagen = nombre;
		
		switch (tipo) {

		case "Pokemon":
			int daño = Integer.parseInt(partes[3]);
			int cantEnergias = Integer.parseInt(partes[4]);
			return new Pokemon(nombre, rareza, tipo, rutaImagen, daño, cantEnergias);
			
		case "Item":
			int bono = Integer.parseInt(partes[3]);
			return new Item(nombre, rareza, tipo, rutaImagen, bono);

		case "Supporter":
			int efectosPorTurno = Integer.parseInt(partes[3]);
			return new Supporter(nombre, rareza, tipo, rutaImagen, efectosPorTurno);

		case "Energy":
			String elemento = partes[3];
			return new Energia(nombre, rareza, tipo, rutaImagen, elemento);

		default:
			throw new IllegalArgumentException("Tipo de carta desconocido: " + tipo);
		}
	}
}


