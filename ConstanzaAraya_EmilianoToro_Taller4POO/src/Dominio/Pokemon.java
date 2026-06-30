package Dominio;

/**
 * Carta tipo Pokemon 
 */
public class Pokemon extends Carta{
	private int daño, cantEnergias;

	public Pokemon(String nombre, String rareza, String tipo, String rutaImagen, int daño, int cantEnergias) {
		super(nombre, rareza, tipo, rutaImagen);
		this.daño = daño;
		this.cantEnergias = cantEnergias;
	}

	public int getDaño() {
		return daño;
	}

	public int getCantEnergias() {
		return cantEnergias;
	}

	@Override
	public double calcularPoder() {
		return ((double) daño / cantEnergias) * 100;

	}

	

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitar(this);

	}




	
}
