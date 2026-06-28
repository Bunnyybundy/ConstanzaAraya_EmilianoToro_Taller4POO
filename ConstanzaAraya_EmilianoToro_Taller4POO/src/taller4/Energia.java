package taller4;

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
	public void calcularPoder() {
		// TODO Auto-generated method stub
		
	}
	
	
}
