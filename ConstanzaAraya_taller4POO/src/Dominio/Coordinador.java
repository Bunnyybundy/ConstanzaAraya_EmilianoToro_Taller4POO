package Dominio;

public class Coordinador extends Usuario {
	private String area;
	public Coordinador(String nombre, String contraseña, String area) {
		super(nombre, contraseña, "Coordinador");
		this.area = area;
	}
	public String getArea() {
		return area;
	}
	
	

	
}
