package Dominio;

import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DialogoCarta extends JDialog{
	private JLabel lblNombre;
	private JLabel lblRareza;
	private JLabel lblTipo;
	private JLabel lblPoder;
	private JLabel lblImagen;
	
	public DialogoCarta(JFrame parent, Carta carta) {
		super(parent, "Detalle de Carta", true);
		setSize(400,300);
		setLocationRelativeTo(parent);
		
		lblNombre = new JLabel("Nombre: " + carta.getNombre());
		lblRareza = new JLabel("Rareza: " + carta.getRareza());
		lblTipo = new JLabel("Tipo: " + carta.getTipo());
		lblPoder = new JLabel("Poder: " + carta.calcularPoder());
		lblImagen = new JLabel((carta.getRutaImagen()));
	
		setLayout(new GridLayout(5,1));
		add(lblNombre);
		add(lblRareza);
		add(lblTipo);
		add(lblPoder);
		add(lblImagen);
	}
	
	
	
}
