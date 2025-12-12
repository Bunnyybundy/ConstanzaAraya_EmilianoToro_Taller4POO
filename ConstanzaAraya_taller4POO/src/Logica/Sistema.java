package Logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Dominio.*;
import Patrones.*;


public class Sistema {
	private static Scanner s;
	
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static ArrayList<Curso> cursos = new ArrayList<>();
	private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
	private static ArrayList<Certificacion> certificaciones = new ArrayList<>();
	private static ArrayList<AsignaturasCertificacion> asignaturas = new ArrayList<>();
	private static ArrayList<RegistroCertificacion> registros = new ArrayList<>();
	private static ArrayList<Nota> nota = new ArrayList<>();
	private static Sistema instancia;
	
	private Sistema() {
		
	}
	
	public static Sistema getInstancia() {
		if(instancia == null) {
			instancia =  new Sistema();
		}
		return instancia;
	}
	
	
    public static void leerUsuarios(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String[] parte = s.nextLine().split(";");
			usuarios.add(UsuarioFactory.crearUsuario(parte));
		
		}
	}
    public static Usuario login(String nombre, String contraseña) {
		for(Usuario u: usuarios) {
			if(u.getNombre().equals(nombre) && u.validarContraseña(contraseña)) {
				return u;
			}
		}
		return null;
	}

	public static void leerRegistros(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String linea = s.nextLine();
			String parte[] = linea.split(";");
			String rut = parte[0];
			String idCertificacion = parte[1];
			String fechaRegistro = parte[2];
			String estado = parte[3];
			int progreso = Integer.parseInt(parte[4]);
			
			RegistroCertificacion registro = new RegistroCertificacion(rut,idCertificacion,fechaRegistro, estado, progreso);
			registros.add(registro);
		}
	}

	public static void leerNotas(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String linea = s.nextLine();
			String parte[] = linea.split(";");
			String rut = parte[0];
			String codigoAsignatura = parte[1];
			double calificacion = Double.parseDouble(parte[2]);
			String estado = parte[3];
			String semestre = parte[4];
			
			Nota notas = new Nota(rut, codigoAsignatura,calificacion, estado, semestre);
			nota.add(notas);
		}
	}

	public static void leerEstudiantes(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String linea = s.nextLine();
			String parte[] = linea.split(";");
			String rut = parte[0];
			String nombre = parte[1];
			String carrera = parte[2]; 
			int semestre = Integer.parseInt(parte[3]);
			String correoE = parte[4];
			String contraseña = parte[5];
			
			Estudiante estudiante = new Estudiante(rut,nombre,carrera, semestre,correoE, contraseña);
			estudiantes.add(estudiante);
		}
	}

	public static void leerCursos(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String linea = s.nextLine();
			String parte[] = linea.split(";");
			String nrc = parte[0];
			String nombre = parte[1];
			int semestre = Integer.parseInt(parte[2]); 
			int creditos = Integer.parseInt(parte[3]);
			String area = parte[4];
			ArrayList<String> prerrequisitos = new ArrayList<>();
			if(parte.length > 5 && !parte[5].isEmpty()) {
				for(String p : parte[5].split(";")) {
					prerrequisitos.add(p.trim());
				}
			}
			Curso curso = new Curso(nrc,nombre, semestre,creditos,area,prerrequisitos);
			cursos.add(curso);
			
		}
	}

	public static void leerCertificaciones(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String linea = s.nextLine();
			String parte[] = linea.split(";");
			String id = parte[0];
			String nombre = parte[1];
			String descripcion = parte[2]; 
			int requisitos = Integer.parseInt(parte[3]);
			int validez = Integer.parseInt(parte[4]);
			
			Certificacion certificacion = new Certificacion(id,nombre,descripcion,requisitos,validez);
			certificaciones.add(certificacion);
		}
	}

	public static void leerAsigCertificaciones(String archivo) throws FileNotFoundException {
		s = new Scanner(new File(archivo));
		while(s.hasNextLine()) {
			String linea = s.nextLine();
			String parte[] = linea.split(";");
			String id = parte[0];
			String nrc = parte[1];
			
			AsignaturasCertificacion asigCertificacion = new AsignaturasCertificacion(id, nrc);
			asignaturas.add(asigCertificacion);
		}
	}
	
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public static ArrayList<Estudiante> getEstudiantes(){
		return estudiantes;
	}
	
	public static ArrayList<Certificacion> getCertificaciones(){
		return certificaciones;
	}
	public static ArrayList<Curso> getCursos(){
		return cursos;	
	}
	public static ArrayList<RegistroCertificacion> getRegistros(){
		return registros;
	}
	public static ArrayList<AsignaturasCertificacion> getAsignaturas(){
		return asignaturas;	
	}
	public static ArrayList<Nota> getNota(){
		return nota;
	}
	
	public static Usuario buscarUsuarioPorNombre(String nombre) {
		for(Usuario u : usuarios) {
			if(u.getNombre().equals(nombre)) {
				return u;
			}
		}
		return null;
	}
	public static Estudiante buscarEstudiantePorRut(String rut) {
	    for (Estudiante e : estudiantes) {
	        if (e.getRut().equals(rut)) {
	            return e;
	        }
	    }
	    return null;
	}
	public static Curso buscarCursoPorNRC(String nrc) {
	    for (Curso c : cursos) {
	        if (c.getNrc().equals(nrc)) {
	            return c;
	        }
	    }
	    return null;
	}
	
	public static void aplicarVisitorCertificaciones(visitor v) {
	    for (Certificacion c : certificaciones) {
	        c.accept(v);
	    }
	}

	public static Certificacion buscarCertificacionPorNombre(String seleccion) {
		for(Certificacion c : certificaciones) {
			if(c.getNombre().equalsIgnoreCase(seleccion)) {
				return c;
			}
		}
		return null;
	}

	public static void generarCertificado(Estudiante est, Certificacion cert) {
		Validar_CertiVisitor visitor = new Validar_CertiVisitor(est);
		cert.accept(visitor);
		
		if(visitor.cumpleRequisitos()) {
			
            String linea = est.getRut() + ";" + cert.getId() + ";Completado";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/certificados.txt", true))) {
                bw.write(linea);
                bw.newLine();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar certificado: " + ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(null,"Certificado generado para " + est.getNombre() +" en la certificación " + cert.getNombre());
        } else {
            JOptionPane.showMessageDialog(null,
                "El estudiante " + est.getNombre() +" aún no cumple los requisitos de " + cert.getNombre());
        }
	}

	public static int contarInscritos(String id) {
		int count = 0;
		for(RegistroCertificacion r :  registros) {
			if(r.getIdCertificacion().equals(id)) {
				count++;
			}
		}
		return count;
	}

	public static List<Curso> getCursosRequeridos(String id) {
		List<Curso> lista = new ArrayList<>();
		for(AsignaturasCertificacion ac : asignaturas) {
			if(ac.getIdCertificacion().equals(ac.getNrcCursos())) {
				Curso c = buscarCursoPorNRC(ac.getNrcCursos());
				if(c != null) {
					lista.add(c);
				}
			}
			
		}
		return lista;
	}

	public static double porcentajeReprobacionCurso(String nrc) {
		int total = 0;
		int reprobados = 0;
		
		for(Nota n :  nota) {
			if(n.getCodigoAsignatura().equals(nrc)) {
				total++;
				if(n.getEstado().equals("Reprobado")) {
					reprobados++;
				}
			}
		}
		if(total == 0) {
			return 0;
		}
		return (reprobados * 100)/total;
		}

	public static Nota[] getNotasPorRut(String rut) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Certificacion BuscarCertificacionPorId(String idCertificacion) {
		for(Certificacion c : certificaciones) {
			if(c.getId().equals(idCertificacion)) {
				return c;
			}
		}
		return null;
	}

	
}
