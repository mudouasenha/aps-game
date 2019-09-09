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
	DefaultListModel<ImageIcon> modeloLista = null;
	private final Action action = new SwingAction();
	
   public void atualizaMao(ArrayList<ImageIcon> deque) {
		for(ImageIcon img : deque) {
			modeloLista.addElement(img);
		}
	  }
   
   public ArrayList<ImageIcon> iconizador(List<Carta> deque){
		
		ArrayList<ImageIcon> imagens = new ArrayList<ImageIcon>();
		for(Carta carta : deque) {
			if (carta.isEstaVirada()) {
				imagens.add(new ImageIcon(getClass().getResource("1A.jpg")));
			}else {
				switch(carta.getNaipe()) {
				case OURO : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png")));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
					}
				}
				case COPAS : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon("path"));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
				}}
				case ESPADAS : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon("path"));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
				}}
				case PAUS : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon("path"));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
					}
				}
			}
			
			}
		}
		return imagens;
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
		
		modeloLista = new DefaultListModel<ImageIcon>();
		atualizaMao(deque);
		
		
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "DECLARAR");
			putValue(SHORT_DESCRIPTION, "Declarar jogada de acordo com as cartas selecionadas");
		}
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Voce declarou 4 ases");
		}
	}
}