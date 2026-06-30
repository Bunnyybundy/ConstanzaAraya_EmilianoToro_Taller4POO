package Dominio;

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
		return 1;
		
	}
	
	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitar(this);


	}


	
}
