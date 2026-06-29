package taller4;
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
		return 0;
		// TODO Auto-generated method stub
		
	}
	
	
}
