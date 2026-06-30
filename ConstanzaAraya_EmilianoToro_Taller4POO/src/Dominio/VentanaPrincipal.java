package Dominio;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	private PanelAdministracion panelAdministracion;
	private PanelColeccion panelColeccion;
	
	public VentanaPrincipal() throws HeadlessException {
		setTitle("Gestor de Cartas Pokemon");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panelAdministracion = new PanelAdministracion();
		panelColeccion = new PanelColeccion();
		
		setVisible(true);
	}
	
	
}
