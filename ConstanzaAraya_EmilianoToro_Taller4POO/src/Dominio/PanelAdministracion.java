package Dominio;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Logica.Sistema;


public class PanelAdministracion extends JPanel{
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private Sistema sistema;
	
	public PanelAdministracion() {
		this.sistema = sistema;
		setLayout(new FlowLayout());
		
		btnAgregar = new JButton("Agregar Carta");
		btnEliminar = new JButton("Eliminar Carta");
		btnModificar = new JButton("Modificar Carta");
		
		add(btnAgregar);
		add(btnEliminar);
		add(btnModificar);
		
		btnAgregar.addActionListener(e -> {
			JOptionPane.showMessageDialog(this, "Funcion agregar");
		});
		
		btnEliminar.addActionListener(e -> {
			JOptionPane.showMessageDialog(this, "Funcion eliminar");
		});
		
		btnModificar.addActionListener(e -> {
			JOptionPane.showMessageDialog(this, "Funcion Modificar");
		});
		
		
	}
	
	
}
