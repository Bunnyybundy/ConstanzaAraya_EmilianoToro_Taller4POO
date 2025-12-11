package Dominio;

public abstract class Usuario {
	private String nombre;
	private String contraseña;
	private String rol;
	
	public Usuario(String nombre, String contraseña, String rol) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getRol() {
		return rol;
	}
	
	public boolean validarContraseña(String clave) {
		return this.contraseña!= null && this.contraseña.equals(clave);
	}
	
}
