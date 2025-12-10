package Dominio;

public class Estudiante {
	private String rut;
	private String nombre;
	private String carrera; 
	private String correoE;
	private String contraseña;
	
	public Estudiante(String rut, String nombre, String carrera, String correoE, String contraseña) {
		this.rut = rut;
		this.nombre = nombre;
		this.carrera = carrera;
		this.correoE = correoE;
		this.contraseña = contraseña;
	}
	
	
}
