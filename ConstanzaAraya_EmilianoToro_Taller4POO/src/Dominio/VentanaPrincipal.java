package Dominio;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import Logica.Sistema;
import Logica.SistemaImp;

public class VentanaPrincipal extends JFrame{
	private PanelAdministracion panelAdministracion;
	private PanelColeccion panelColeccion;
	private Sistema sistema;
	
	public VentanaPrincipal(){
		setTitle("Gestor de Cartas Pokemon");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		sistema = SistemaImp.getInstancia();
		
		panelAdministracion = new PanelAdministracion();
		panelColeccion = new PanelColeccion();
		
		JTabbedPane tabs = new JTabbedPane();
		tabs.addTab("Adimistracion", panelAdministracion);
		tabs.addTab("Coleccion", panelColeccion);
		setVisible(true);
	}
	
	
}
