package taller4;

public class Supporter extends Carta{
	private int efectosPorTurno;

	public Supporter(String nombre, String rareza, String tipo, String rutaImagen, int efectosPorTurno) {
		super(nombre, rareza, tipo, rutaImagen);
		this.efectosPorTurno = efectosPorTurno;
	}

	@Override
	public void calcularPoder() {
		// TODO Auto-generated method stub
		
	}
	
	
}
