package Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import Dominio.Estudiante;

public class VentanaEstudiante extends JFrame{
	private Estudiante estudiante;

	public VentanaEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
		setTitle("Menu Estudiante");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JTabbedPane tabs = new JTabbedPane();
		
		tabs.addTab("Perfil", crearPanelPerfil());
		tabs.addTab("Malla Curricular" , crearPanelMalla());
		tabs.addTab("Certificaciones", crearPanelCertificaciones());
		tabs.addTab("Progreso", crearPanelProgreso());
		add(tabs);
		
	}

		private JPanel crearPanelPerfil() {
			JPanel panel = new JPanel(new BorderLayout());
			JTextArea area = new JTextArea();
			area.setEditable(false);
			area.append("Perfil del Estudiante: \n");
			area.append("Nombre:"+ estudiante.getNombre() + "\n");
			area.append("Rut:" + estudiante.getRut() + "\n");
			area.append("Carrera:" + estudiante.getCarrera() + "\n");
			area.append("Semestre:" + estudiante.getSemestre() + "\n");
			area.append("Correo:" + estudiante.getCorreoE() + "\n");
			panel.add(new JScrollPane(area), BorderLayout.CENTER);
			return panel;
	}
		
		private JPanel crearPanelMalla() {
		JPanel panel = new JPanel(new GridLayout(8,6));
		for(int i = 1 ; i <= 8; i++) {
			JButton cursoBtn = new JButton("Curso" + i);
			cursoBtn.setBackground(Color.LIGHT_GRAY);
			cursoBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Detalles del curso..."));
			panel.add(cursoBtn);
		}
		return panel;
	}
		private JPanel crearPanelCertificaciones() {
		JPanel panel = new JPanel(new GridLayout());

			return null;
	}
		private Component crearPanelProgreso() {
		JPanel panel = new JPanel(new GridLayout(0,1));
		return null;
	}

}
