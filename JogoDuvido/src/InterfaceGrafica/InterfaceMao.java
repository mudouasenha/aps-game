package InterfaceGrafica;

import javax.swing.JPanel;

import Modelo.Carta;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import java.util.List;
import javax.swing.JScrollPane;

public class InterfaceMao extends JPanel{
	
	public InterfaceMao() {
		super();
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JButton btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 580, 100);
		add(scrollPane);
		
		JList list = new JList();
		list.setVisibleRowCount(1);
		list.setBackground(new Color(0, 100, 0));
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		scrollPane.setViewportView(list);
		

		DefaultListModel modeloLista = new DefaultListModel();
	}
	}
	
<<<<<<< HEAD
=======

>>>>>>> 1d9f08ec6682d04fbe5d61310812afac1ac4a992
