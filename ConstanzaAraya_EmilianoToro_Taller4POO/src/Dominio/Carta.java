package Dominio;
/**
 * Clase abstracta base para todas las cartas. 
 */
public abstract class Carta {
	protected String nombre, rareza,tipo,rutaImagen;

	public Carta(String nombre, String rareza, String tipo, String rutaImagen) {
		super();
		this.nombre = nombre;
		this.rareza = rareza;
		this.tipo = tipo;
		this.rutaImagen = rutaImagen;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRareza() {
		return rareza;
	}

	public String getTipo() {
		return tipo;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}
	
	
	public abstract void aceptar(Visitor visitor);


	
	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}
	//Metodo abstracto que cada subclase implementará
	public abstract double calcularPoder();

	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", rareza=" + rareza + ", tipo=" + tipo + ", rutaImagen=" + rutaImagen + "]";
	}
	
}
