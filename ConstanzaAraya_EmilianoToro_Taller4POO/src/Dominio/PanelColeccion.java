package Dominio;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import Logica.Sistema;

public class PanelColeccion extends JPanel{
	private JButton btnOrdenarRareza;
	private JButton btnOrdenarNombre;
	private JButton btnOrdenarPoder;
	private JList<String> listaCartas;
	private Sistema sistema;
	
	public PanelColeccion() {
		this.sistema = sistema;
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
		
		actualizarLista();
		
		listaCartas.addListSelectionListener(e -> {
			if(!e.getValueIsAdjusting()) {
				String seleccion = listaCartas.getSelectedValue();
				if(seleccion != null) {
					Carta carta = sistema.getCartas().stream().filter(c -> c.getNombre().equals(seleccion)).findFirst().orElse(null);
					if(carta != null) {
						new DialogoCarta((JFrame) SwingUtilities.getWindowAncestor(this), carta).setVisible(true);
					}
				}
			}
		});
	}

	private void actualizarLista() {
		DefaultListModel<String> modelo = new DefaultListModel<>();
		for(Carta c: sistema.getCartas()) {
			modelo.addElement(c.getNombre());
		}
		listaCartas.setModel(modelo);
	}
	
	
	
	
}
