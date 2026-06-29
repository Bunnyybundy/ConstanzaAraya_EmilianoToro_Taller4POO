package taller4;
/**
 * Carta tipo Energy 
 */
public class Energia extends Carta{
	private String elemento;

	public Energia(String nombre, String rareza, String tipo, String rutaImagen, String elemento) {
		super(nombre, rareza, tipo, rutaImagen);
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	@Override
	public double calcularPoder() {
		return 0;
		
	}
	
	
}
