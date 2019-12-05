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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class InterfaceMao extends JPanel {
	JButton btnDeclarar = null;
	JScrollPane scrollPane = null;
	JList<String> cartas = null;
	List<String> cartasSelecionadas = null;
	DefaultListModel<String> modeloLista = null;
	DefaultListModel<String> modeloListaSelecionadas = null;
	private final Action action = new SwingAction();



   public InterfaceMao() {
		super();

		setBackground(new Color(25, 25, 112));
		setLayout(null);

		btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setAction(action);
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);

		modeloLista = new DefaultListModel<String>();
		modeloListaSelecionadas = new DefaultListModel<String>();
		//cartasSelecionadas = new ArrayList<String>(modeloListaSelecionadas);




		//atualizaMao(deque);


		//apenas para demonstracao
		List<Carta> mao = new ArrayList<Carta>();
		mao.add(new Carta(1, Naipe.OURO));
		mao.add(new Carta(1, Naipe.OURO));
		mao.add(new Carta(1, Naipe.OURO));


	   List<Carta> mao2 = new ArrayList<Carta>();
	   mao2.add(new Carta(1, Naipe.OURO));
	   mao2.add(new Carta(1, Naipe.OURO));
	   mao2.add(new Carta(1, Naipe.OURO));


	   	recebeCartas(mao);
		recebeCartas(mao2);


		cartas = new JList(modeloLista);
		cartas.setVisibleRowCount(1);
		cartas.setBackground(new Color(0, 100, 0));
		cartas.setLayoutOrientation(JList.HORIZONTAL_WRAP);

		cartas.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				cartasSelecionadas = cartas.getSelectedValuesList();
			}
		});

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
		@Override
		public void actionPerformed(ActionEvent e) {
			int nroDeCartasSelecionadas = cartasSelecionadas.size();

			if(nroDeCartasSelecionadas < 1) {
				JOptionPane.showMessageDialog(null, "Selecione ao menos uma carta");
			} else if(nroDeCartasSelecionadas > 4) {
				JOptionPane.showMessageDialog(null, "O numero máximo de cartas declaradas é 4");
			} else {
				JOptionPane.showMessageDialog(null, "Voce declarou " + nroDeCartasSelecionadas + " ases");
				System.out.println(criaCartas(cartasSelecionadas));
				//atorJogador.enviaMao(criaCartas(cartasSelecionadas));
			}
		}
	}

	public List<Carta> criaCartas(List<String> cartasSelecionadas) {
   		List<Carta> cartasJogada = new ArrayList<Carta>();
   		for (int i = 0; i < cartasSelecionadas.size(); i++) {
   			String[] valorENaipe = new String[2];
   			valorENaipe = cartasSelecionadas.get(i).split(" ");
   			System.out.println(valorENaipe);

   			cartasJogada.add(new Carta(valorCartaString(valorENaipe[1]), transformaNaipe(valorENaipe[0])));
		}

   		return cartasJogada;
	}

	public Naipe transformaNaipe(String naipe) {
		Naipe naipeNovaCarta = null;
   		switch(naipe) {
			case "OURO":
				naipeNovaCarta = Naipe.OURO;
				break;
			case "ESPADAS":
				naipeNovaCarta = Naipe.ESPADAS;
				break;
			case "COPAS":
				naipeNovaCarta = Naipe.COPAS;
				break;
			case "PAUS":
				naipeNovaCarta = Naipe.PAUS;
				break;
			default:
				break;
		}

		return naipeNovaCarta;
	}

	public int valorCartaString(String valorCarta) {
   		int valor = Integer.parseInt(valorCarta);

   		return valor;
	}

	
	public List<JLabel> atualizaMao(List<JLabel> deque) {
		int i = 0;
		for(JLabel carta : deque) {
			modeloLista.addElement(carta.getText());
			cartas.add(carta);
		}
		cartas.repaint();
		
		return deque;
	  }
   
   
   public ArrayList<Carta> iconizador(ArrayList<Carta> deque){
		
		//ArrayList<JLabel> cartas = new ArrayList<JLabel>();
		for(Carta carta : deque) {
			if (carta.isEstaVirada()) {
				carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
			}else {
				switch(carta.getNaipe()) {
				case OURO : {
					switch(carta.getValor()) {
					case 1 :  carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 2 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 3 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 4 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 5 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 6 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 7 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 8 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 9 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 10 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 11 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 12 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 13 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					}
				}
				case COPAS : {
					switch(carta.getValor()) {
					case 1 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 2 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 3 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 4 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 5 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 6 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 7 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 8 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 9 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 10 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 11 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 12 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 13 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
				}}
				case ESPADAS : {
					switch(carta.getValor()) {
					case 1 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 2 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 3 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 4 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 5 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 6 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 7 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 8 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 9 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 10 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 11 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 12 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 13 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
				}}
				case PAUS : {
					switch(carta.getValor()) {
					case 1 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 2 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 3 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 4 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 5 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 6 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 7 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 8 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 9 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 10 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 11 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 12 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					case 13 : carta.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
					}
				}
			}
			
			}
		}
		return deque;
	}

   public void adicionaItensLista(List<String> cartas) {
   for (int i = 0; i < cartas.size(); i++) {
		modeloLista.add(i, cartas.get(i));
		}
   }
   
   public ArrayList<String> laborizador (List<Carta> deque) {
	   
	   ArrayList<String> cartas = new ArrayList<String>();
	   for(Carta carta : deque) {
		   JLabel cartaLabel = new JLabel();
		   cartaLabel.setIcon(carta.getImagem());
		   cartaLabel.setText(carta.getNaipe().toString() + " " + carta.getValor());
		   cartas.add(cartaLabel.getText());
	   }
	   return cartas;
	   
   }
   public void recebeCartas(List<Carta> cartas){
		List<String> cartasLaborizadas = laborizador(cartas);
		adicionaItensLista(cartasLaborizadas);
   }



}