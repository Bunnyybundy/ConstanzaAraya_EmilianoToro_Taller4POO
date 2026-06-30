package Dominio;

/**
 * Carta tipo supporter 
 */
public class Supporter extends Carta{
	private int efectosPorTurno;

	public Supporter(String nombre, String rareza, String tipo, String rutaImagen, int efectosPorTurno) {
		super(nombre, rareza, tipo, rutaImagen);
		this.efectosPorTurno = efectosPorTurno;
	}

	@Override
	public double calcularPoder() {
		return efectosPorTurno * 50;
	}
	
	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitar(this);

	}


	
}
