package Dominio;

import Patrones.visitable;
import Patrones.visitor;

public class Certificacion implements visitable  {
	private String id;
	private String nombre;
	private String descripcion;
	private int requisitosCreditos;
	private int validez;
	
	public Certificacion(String id, String nombre, String descripcion, int requisitosCreditos, int validez) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.requisitosCreditos = requisitosCreditos;
		this.validez = validez;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
			this.id = id;
		}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public String getDescripcion() {
		return descripcion;
	}

	public int getRequisitosCreditos() {
		return requisitosCreditos;
	}

	public int getValidez() {
		return validez;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setRequisitosCreditos(int requisitosCreditos) {
		this.requisitosCreditos = requisitosCreditos;
	}

	public void setValidez(int validez) {
		this.validez = validez;
	}

	@Override
    public void accept(visitor v) {
        v.visit(this);
    }
    
    
	
	
}
