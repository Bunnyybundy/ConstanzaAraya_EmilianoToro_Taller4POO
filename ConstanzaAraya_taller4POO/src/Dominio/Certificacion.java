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

	public String getNombre() {
		return nombre;
	}
	
    @Override
    public void accept(visitor v) {
        v.visit(this);
    }
	
	
}
