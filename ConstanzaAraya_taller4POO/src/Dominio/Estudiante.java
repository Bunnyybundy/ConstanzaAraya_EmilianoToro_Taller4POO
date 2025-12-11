package Dominio;

import Patrones.visitable;
import Patrones.visitor;

public class Estudiante extends Usuario implements visitable {
	private String rut;
	private String carrera; 
	private int semestre;
	private String correoE;
	
	public Estudiante(String rut, String nombre, String carrera, int semestre, String correoE, String contraseña) {
		super(nombre,contraseña,"Estudiante");
		this.rut = rut;
		this.carrera = carrera;
		this.semestre = semestre;
		this.correoE = correoE;
	}
	public String getRut() {
		return rut;
	}

    public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String getCorreoE() {
		return correoE;
	}

	public void setCorreoE(String correoE) {
		this.correoE = correoE;
	}


	@Override
    public void accept(visitor v) {
        v.visit(this);
    }
	
	
	
	
}
