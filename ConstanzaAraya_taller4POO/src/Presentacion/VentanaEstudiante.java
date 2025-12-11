package Presentacion;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Dominio.Estudiante;

public class VentanaEstudiante extends JFrame{
	private Estudiante estudiante;

	public VentanaEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
		setTitle("Menu Estudiante");
		setSize(450,280);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextArea area = new JTextArea();
		area.append("Perfil del Estudiante: \n");
		area.append("Nombre:"+ estudiante.getNombre() + "\n");
		area.append("Rut:" + estudiante.getRut() + "\n");
		area.append("Carrera:" + estudiante.getCarrera() + "\n");
		area.append("Semestre:" + estudiante.getSemestre() + "\n");
		area.append("Correo:" + estudiante.getCorreoE() + "\n");
		
		add(new JScrollPane(area));
	}


}
