package Dominio;

public class AsignaturasCertificacion {
	private String idCertificacion;
	private String nrcCursos;
	
	public AsignaturasCertificacion(String idCertificacion, String nrcCursos) {
		this.idCertificacion = idCertificacion;
		this.nrcCursos = nrcCursos;
	}

	public String getIdCertificacion() {
		return idCertificacion;
	}

	public void setIdCertificacion(String idCertificacion) {
		this.idCertificacion = idCertificacion;
	}

	public String getNrcCursos() {
		return nrcCursos;
	}

	public void setNrcCursos(String nrcCursos) {
		this.nrcCursos = nrcCursos;
	}

	@Override
	public String toString() {
		return "idCertificacion=" + idCertificacion + ", nrcCursos=" + nrcCursos ;
	}
	
	
}
