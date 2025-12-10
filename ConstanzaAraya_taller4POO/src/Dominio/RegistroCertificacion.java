package Dominio;

public class RegistroCertificacion {
	private String rut;
	private String idCertificacion;
	private String fechaRegistro;
	private String estado ;
	private int progreso;
	
	public RegistroCertificacion(String rut, String idCertificacion, String fechaRegistro, String estado,
			int progreso) {
		this.rut = rut;
		this.idCertificacion = idCertificacion;
		this.fechaRegistro = fechaRegistro;
		this.estado = estado;
		this.progreso = progreso;
	}
	
	
}
