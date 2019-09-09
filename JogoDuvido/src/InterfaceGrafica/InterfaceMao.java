package InterfaceGrafica;

import javax.swing.JPanel;

import Modelo.Carta;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;

public class InterfaceMao extends JPanel {
	JButton btnDeclarar = null;
	JScrollPane scrollPane = null;
	JList cartas = null;
	DefaultListModel modeloLista = null;
	
   public void atualizaMao(ArrayList<ImageIcon> cartas) {
		for(ImageIcon img : cartas) {
			modeloLista.addElement(img);
		}
	  }
	
	public InterfaceMao() {
		super();
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 580, 100);
		add(scrollPane);
		
		cartas = new JList();
		cartas.setVisibleRowCount(1);
		cartas.setBackground(new Color(0, 100, 0));
		cartas.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		scrollPane.setViewportView(cartas);
		add(cartas);
		
		modeloLista = new DefaultListModel();
		
		
	}
	
}