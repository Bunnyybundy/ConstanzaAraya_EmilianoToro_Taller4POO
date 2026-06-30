package Dominio;

/**
 * Carta tipo Item 
 */
public class Item extends Carta{
	private int bono;

	public Item(String nombre, String rareza, String tipo, String rutaImagen, int bono) {
		super(nombre, rareza, tipo, rutaImagen);
		this.bono = bono;
	}

	public int getBono() {
		return bono;
	}

	@Override
	public double calcularPoder() {
		return bono * 20;

	}
	
	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitar(this);

	}



	
}
