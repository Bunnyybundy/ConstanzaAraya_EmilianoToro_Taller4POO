package Dominio;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.FlowLayout;


public class PanelAdministracion extends JPanel{
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnModificar;
	
	public PanelAdministracion() {
		setLayout(new FlowLayout());
		
		btnAgregar = new JButton("Agregar Carta");
		btnEliminar = new JButton("Eliminar Carta");
		btnModificar = new JButton("Modificar Carta");
		
		add(btnAgregar);
		add(btnEliminar);
		add(btnModificar);
	}
	
	
}
