package InterfaceGrafica;

import javax.swing.JPanel;

import Modelo.Carta;
import Modelo.Naipe;
import Modelo.ValorDeCarta;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridLayout;
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
	DefaultListModel<JLabel> modeloLista = null;
	private final Action action = new SwingAction();
 
	
   public void atualizaMao(ArrayList<JLabel> deque) {
		for(JLabel carta : deque) {
			modeloLista.addElement(carta);
			cartas.repaint();
		}
	  }
   
   
   public ArrayList<JLabel> iconizador(ArrayList<Carta> deque){
		
		ArrayList<JLabel> imagens = new ArrayList<JLabel>();
		for(Carta carta : deque) {
			if (carta.isEstaVirada()) {
				carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
			}else {
				switch(carta.getNaipe()) {
				case OURO : {
					switch(carta.getValor()) {
					case A : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DOIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case TRES : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case QUATRO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case CINCO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SEIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SETE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case OITO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case NOVE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DEZ : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case J : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case Q : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case K : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					}
				}
				case COPAS : {
					switch(carta.getValor()) {
					case A : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DOIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case TRES : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case QUATRO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case CINCO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SEIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SETE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case OITO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case NOVE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DEZ : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case J : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case Q : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case K : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
				}}
				case ESPADAS : {
					switch(carta.getValor()) {
					case A : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DOIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case TRES : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case QUATRO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case CINCO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SEIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SETE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case OITO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case NOVE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DEZ : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case J : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case Q : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case K : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
				}}
				case PAUS : {
					switch(carta.getValor()) {
					case A : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DOIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case TRES : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case QUATRO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case CINCO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SEIS : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case SETE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case OITO : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case NOVE : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case DEZ : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case J : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case Q : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case K : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					}
				}
			}
			
			}
		}
		return imagens;
	}
	
	public InterfaceMao() {
		super();
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setAction(action);
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);
		
		modeloLista = new DefaultListModel<JLabel>();

		cartas = new JList(modeloLista);
		cartas.setVisibleRowCount(1);
		cartas.setBackground(new Color(0, 100, 0));
		cartas.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		
		
		//atualizaMao(deque);
		
		
		//apenas para demonstracao
		ArrayList<Carta> mao = new ArrayList<Carta>();
		mao.add(new Carta(ValorDeCarta.A, Naipe.OURO));
		mao.add(new Carta(ValorDeCarta.A, Naipe.OURO));
		mao.add(new Carta(ValorDeCarta.A, Naipe.OURO));
		
		atualizaMao(iconizador(mao));
		
		
		JLabel carta1 = new JLabel("A_OURO");
		carta1.setIcon(new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png")));
		modeloLista.addElement(carta1);
		
		scrollPane = new JScrollPane(cartas);
		scrollPane.setBounds(12, 12, 580, 100);
		scrollPane.setViewportView(cartas);
		scrollPane.setBackground(Color.WHITE);
		add(scrollPane);
		
		
		
		
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "DECLARAR");
			putValue(SHORT_DESCRIPTION, "Declarar jogada de acordo com as cartas selecionadas");
		}
		public void actionPerformed(ActionEvent e) {
			int nroDeCartasSelecionadas = 4;
			JOptionPane.showMessageDialog(null, "Voce declarou "+nroDeCartasSelecionadas+" ases");
		}
	}
}