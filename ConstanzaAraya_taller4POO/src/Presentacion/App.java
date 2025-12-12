package Presentacion;
//Integrante 1: Constanza Fernanda Araya Plaza – 21.609.057-8 – ICCI
//Integrante 2: Emiliano Ángel Toro Rojas – 21.512.702-8 – ITI
import java.io.FileNotFoundException;
import java.util.Scanner;

import Logica.*;
/**
 * Punto de entrada de la aplicación.
 * Inicializa la ventana de login y carga los datos del sistema desde archivos.
 */
public class App {
	
	private static Scanner s;
	/**
     * Método principal de la aplicación.
     * Abre la ventana de login y carga usuarios, registros, notas,
     * estudiantes, cursos, certificaciones y asignaturas desde archivos.
     *
     * @param args argumentos de línea de comandos
     * @throws FileNotFoundException si alguno de los archivos no existe
     */
	public static void main(String[] args) throws FileNotFoundException {
		new VentanaLogin().setVisible(true);
		s = new Scanner(System.in);
		Sistema sistema = Sistema.getInstancia();
		sistema.leerUsuarios("usuarios.txt");
		sistema.leerRegistros("registros.txt");
		sistema.leerNotas("notas.txt");
		sistema.leerEstudiantes("estudiantes.txt");
		sistema.leerCursos("cursos.txt");
		sistema.leerCertificaciones("certificaciones.txt");
		sistema.leerAsigCertificaciones("asignaturas_certificaciones.txt");
	}

}
