package InterfaceGrafica;

import javax.swing.*;

import Modelo.Carta;
import Modelo.Naipe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class InterfaceMao extends JPanel {
	JButton btnDeclarar = null;
	JScrollPane scrollPane = null;
	JList<String> cartas = null;
	List<String> cartasSelecionadas = null;
	DefaultListModel<String> modeloLista = null;
	private final Action action = new SwingAction();
	protected InterfaceMesa pai;



   public InterfaceMao(InterfaceMesa pai) {

		super();

		this.pai = pai;

		setBackground(new Color(25, 25, 112));
		setLayout(null);

		btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setAction(action);
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);

		modeloLista = new DefaultListModel<String>();


		cartas = new JList(modeloLista);
		cartas.setVisibleRowCount(1);
		cartas.setBackground(new Color(0, 100, 0));
		cartas.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		cartas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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
	public InterfaceMesa getPai(){
       return  pai;
    }

	public class SwingAction extends AbstractAction {
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
				JOptionPane.showMessageDialog(null, "Voce declarou " + nroDeCartasSelecionadas + " cartas");
				System.out.println(geraCartasDeString(cartasSelecionadas));
				getPai().atorJogador.enviaMao(geraCartasDeString(cartasSelecionadas));
			}
		}
	}

	public List<Carta> geraCartasDeString(List<String> cartasSelecionadas) {
   		List<Carta> cartasJogada = new ArrayList<Carta>();
   		for (int i = 0; i < cartasSelecionadas.size(); i++) {

			String[] valorENaipe = cartasSelecionadas.get(i).split(" ");
   			System.out.println(valorENaipe);

   			cartasJogada.add(new Carta(valorCartaString(valorENaipe[1]), transformaNaipe(valorENaipe[0])));
   			modeloLista.removeElement(cartasSelecionadas.get(i));
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

   		return Integer.parseInt(valorCarta);
	}


	public List<JLabel> atualizaMao(List<JLabel> deque) {

		for(JLabel carta : deque) {
			modeloLista.addElement(carta.getText());
			cartas.add(carta);
		}
		cartas.repaint();

		return deque;
	  }
   


   public void adicionaItensLista(List<String> cartas) {

   	//modeloLista.clear();

   	for (int i = 0; i < cartas.size(); i++) {
		modeloLista.addElement(cartas.get(i));
		}

   }
   
   public List<String> laborizador (List<Carta> deque) {
	   
	   List<String> cartas = new ArrayList<String>();
	   for(Carta carta : deque) {
		   JLabel cartaLabel = new JLabel();
		   cartaLabel.setIcon(carta.getImagem());
		   cartaLabel.setText(carta.getNaipe().toString() + " " + carta.getValor());
		   cartas.add(cartaLabel.getText());
	   }
	   return cartas;
	   
   }
   public void recebeCartas(List<Carta> cartas){
	    System.out.println("Recebeu cartas na interface mao");
		List<String> cartasLaborizadas = laborizador(cartas);
		adicionaItensLista(cartasLaborizadas);
   }



}