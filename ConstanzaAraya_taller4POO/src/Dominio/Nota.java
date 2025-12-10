package Dominio;

public class Nota {
	private String rut;
	private String codigoAsignatura;
	private double calificacion ;
	private String estado;
	private String semestre;
	
	public Nota(String rut, String codigoAsignatura, double calificacion, String estado, String semestre) {
		this.rut = rut;
		this.codigoAsignatura = codigoAsignatura;
		this.calificacion = calificacion;
		this.estado = estado;
		this.semestre = semestre;
	}
	
	
}
