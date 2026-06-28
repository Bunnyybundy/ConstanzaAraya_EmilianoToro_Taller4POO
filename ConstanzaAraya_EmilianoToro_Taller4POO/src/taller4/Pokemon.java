package taller4;

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
	public void calcularPoder() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
