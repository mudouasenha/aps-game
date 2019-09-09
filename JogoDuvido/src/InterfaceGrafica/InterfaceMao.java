package InterfaceGrafica;

import javax.swing.JPanel;

import Modelo.Carta;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class InterfaceMao extends JPanel {
	JButton btnDeclarar = null;
	JScrollPane scrollPane = null;
	JList cartas = null;
	DefaultListModel modeloLista = null;
	private final Action action = new SwingAction();
	
   public void atualizaMao(ArrayList<ImageIcon> deque) {
		for(ImageIcon img : deque) {
			modeloLista.addElement(img);
		}
	  }
	
	public InterfaceMao(ArrayList<ImageIcon> deque) {
		super();
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setAction(action);
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
		
		modeloLista = new DefaultListModel();
		atualizaMao(deque);
		
		
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "DECLARAR");
			putValue(SHORT_DESCRIPTION, "Declarar jogada de acordo com as cartas selecionadas");
		}
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Voce declarou 4 valetes");
		}
	}
}