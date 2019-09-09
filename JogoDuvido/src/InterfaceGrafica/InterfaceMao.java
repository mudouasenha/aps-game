package InterfaceGrafica;

import javax.swing.JPanel;

import Modelo.Carta;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import java.util.List;

public class InterfaceMao extends JPanel{
	
	public InterfaceMao() {
		super();
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JButton btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);
		

		DefaultListModel modeloLista = new DefaultListModel();
		
		JList list = new JList(modeloLista);
		list.setVisibleRowCount(1);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setBounds(12, 12, 581, 76);
		add(list);
	}
	
		
	}
	
}
