package taller4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelColeccion extends JPanel{
	private JButton btnOrdenarRareza;
	private JButton btnOrdenarNombre;
	private JButton btnOrdenarPoder;
	private JList<String> listaCartas;
	
	public PanelColeccion() {
		setLayout(new BorderLayout());
		
		JPanel panelBotones = new JPanel();
		btnOrdenarRareza = new JButton("Ordenar por Rareza");
		btnOrdenarNombre = new JButton("Ordenar por Nombre");
		btnOrdenarPoder = new JButton("Ordenar por Poder");
		
		panelBotones.add(btnOrdenarRareza);
		panelBotones.add(btnOrdenarNombre);
		panelBotones.add(btnOrdenarPoder);
		
		listaCartas = new JList<>();
		JScrollPane scroll = new JScrollPane(listaCartas);
		
		add(panelBotones,BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
	}
	
	
	
	
}
