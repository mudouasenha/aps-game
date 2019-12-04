package InterfaceGrafica;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import Modelo.Carta;
import Modelo.Mesa;
import Rede.AtorNetgames;


public class InterfaceMesa extends JFrame{
	
	protected AtorJogador ator;
	protected JLabel lblNomeadversario = null;
	protected JLabel lblNomeadversario_1 = null;
	protected JMenuBar menuBar = null;
	protected JMenu mnOpes = null;
	protected JMenuItem mntmConectar = null;
	protected JMenuItem mntmDesconectar = null;
	protected JMenuItem mntmIniciarPartida = null;
	protected InterfaceMao panel = null;
	protected JButton btnDuvido = null;
	protected JLabel lblMonte = null;
	protected JPanel panel_1 = null;
	protected JLabel lblImgcartas = null;
	protected JPanel panel_2 = null;
	protected JLabel labelImgCartas1 = null;
	protected JMenuItem mntmLocalhost = null;
	protected JMenuItem mntmUFSC = null;
	protected JMenu menuHost = null;



	protected AtorJogador atorJogador;




	
	public InterfaceMesa(AtorJogador atorJogador){

		this.atorJogador = atorJogador;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//atorNetGames = new AtorNetgames(mesa);
		this.getContentPane().setBackground(new Color(0, 100, 0));

		menuBar = new JMenuBar();

		mnOpes = new JMenu("Opções");
		menuHost = new JMenu("Host");



		mntmLocalhost = new JMenuItem("localhost");
		mntmLocalhost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				atorJogador.setServidor("localhost");
				notificar("localhost setado");
			}
		});
		menuHost.add(mntmLocalhost);


		mntmUFSC = new JMenuItem("labsoft");
		mntmUFSC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				atorJogador.setServidor("netgames.labsoft.ufsc.br");
				notificar("netgames.labsoft.ufsc.br setado");
			}
		});
		menuHost.add(mntmUFSC);

		
		mnOpes.add(menuHost);
		menuBar.add(mnOpes);
		
		mntmConectar = new JMenuItem("Conectar");
		mntmConectar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nomeObtido = JOptionPane.showInputDialog(rootPane,"Informe o nome do jogador");
				atorJogador.conectar(nomeObtido);
			}
		});
		mnOpes.add(mntmConectar);
		
		mntmDesconectar = new JMenuItem("Desconectar");
		mntmDesconectar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				atorJogador.desconectar();
			}
		});
		mnOpes.add(mntmDesconectar);
		
		mntmIniciarPartida = new JMenuItem("Iniciar Partida");
		mntmIniciarPartida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				atorJogador.iniciarPartida();
				//JOptionPane.showMessageDialog(rootPane, "Voce precisa estar conectado para desconectar");
			}
		});
		mnOpes.add(mntmIniciarPartida);
		getContentPane().setLayout(null);
		
		panel_1 = new JPanel();
		panel = new InterfaceMao();
		panel.setBounds(12, 327, 719, 100);
		getContentPane().add(panel);
		setJMenuBar(menuBar);
		
		btnDuvido = new JButton("DUVIDO!");
		btnDuvido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				atorJogador.duvidar();
				// JOptionPane.showMessageDialog(null, "Voce perdeu o desafio");
			}
		});
		btnDuvido.setBounds(319, 290, 114, 25);
		getContentPane().add(btnDuvido);
		
		lblMonte = new JLabel("Monte");
		lblMonte.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonte.setIcon(new ImageIcon(InterfaceMesa.class.getResource("/InterfaceGrafica/Imagens/monte.png")));
		lblMonte.setBounds(319, 105, 87, 90);
		getContentPane().add(lblMonte);
		
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(12, 12, 133, 169);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNomeadversario = new JLabel("nomeAdversario1");
		lblNomeadversario.setBounds(12, 12, 109, 22);
		panel_1.add(lblNomeadversario);
		
		lblImgcartas = new JLabel("imgCartas");
		lblImgcartas.setIcon(new ImageIcon(InterfaceMesa.class.getResource("/InterfaceGrafica/Imagens/carta-oculta.png")));
		lblImgcartas.setBounds(12, 58, 63, 81);
		panel_1.add(lblImgcartas);
		
		JLabel labelQtdAdv = new JLabel("1");
		labelQtdAdv.setFont(new Font("Garuda", Font.BOLD, 20));
		labelQtdAdv.setBounds(87, 58, 34, 99);
		panel_1.add(labelQtdAdv);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(615, 12, 133, 169);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNomeadversario_1 = new JLabel("nomeAdversario2");
		lblNomeadversario_1.setBounds(12, 12, 109, 22);
		panel_2.add(lblNomeadversario_1);
		
		labelImgCartas1 = new JLabel("imgCartas");
		labelImgCartas1.setIcon(new ImageIcon(InterfaceMesa.class.getResource("/InterfaceGrafica/Imagens/carta-oculta.png")));
		labelImgCartas1.setBounds(51, 57, 70, 100);
		panel_2.add(labelImgCartas1);
		
		JLabel labelQtdAdv1 = new JLabel("1");
		labelQtdAdv1.setFont(new Font("Garuda", Font.BOLD, 20));
		labelQtdAdv1.setBounds(12, 57, 34, 99);
		panel_2.add(labelQtdAdv1);
		
		JLabel labelQtdMonte = new JLabel("0");
		labelQtdMonte.setForeground(Color.CYAN);
		labelQtdMonte.setBackground(Color.CYAN);
		labelQtdMonte.setFont(new Font("Garuda", Font.BOLD, 20));
		labelQtdMonte.setHorizontalAlignment(SwingConstants.CENTER);
		labelQtdMonte.setBounds(319, 203, 87, 32);
		getContentPane().add(labelQtdMonte);
		
		JTextPane txtpnUltimaJogada = new JTextPane();
		txtpnUltimaJogada.setEditable(false);
		txtpnUltimaJogada.setBackground(Color.GRAY);
		txtpnUltimaJogada.setText("Ultima jogada");
		txtpnUltimaJogada.setBounds(214, 12, 345, 32);
		getContentPane().add(txtpnUltimaJogada);
		
		panel = new InterfaceMao();
		
		
        this.setSize(760, 500);
        this.setVisible(true);
        this.setResizable(true);
	}
	
	public ArrayList<JLabel> atualizaCartas(ArrayList<JLabel> deque) {
		return panel.atualizaMao(deque);
	}
	
	public ArrayList<Carta> iconizar(ArrayList<Carta> deque) {
		return panel.iconizador(deque);
	}
	
	public ArrayList<JLabel> laborizar(ArrayList<Carta> deque) {
		return panel.laborizador(deque);
	}
	
	public void adicionarItensLista(ArrayList<JLabel> cartas) {
		panel.adicionaItensLista(cartas);
	}

	public void notificar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public void informaStatus(int status) {
		switch(status) {
			case 0:
				notificar("Desconectou com sucesso");
			case 1:
				notificar("Já desconectado");
				break;
			case 2:
				notificar("Erro de Desconexão");
				break;
			case 3:
				notificar("Conectou com sucesso");
				break;
			case 4:
				notificar("Já conectado");
				break;
			case 5:
				notificar("Erro de Conexao");
				break;
			case 6:
				notificar("Recebeu nova partida");
				break;
			case 7:
				notificar("Sem conexão para inicio");
				break;
			case 8:
				notificar("Já tem partida em andamento");
				break;
			case 9:
				notificar("Não há jogadores suficientes");
				break;
			case 10:
				notificar("Solicitação de início enviada");
				break;
			case 11:
				notificar("Não duvide de si mesmo");
				break;
			case 12:
				notificar("Desafiador venceu");
				break;
			case 13:
				notificar("Desafiador perdeu");
				break;
			case 14:
				notificar("Sua vez de jogar");
				break;
			case 15:
				notificar("Voce venceu");
				break;
			case 16:
				notificar("Voce perdeu");
				break;
			case 17:
				notificar("Recebeu cartas do ");
				break;
			case 18:
				notificar("Jogada sucedida");
				break;
			case 19:
				notificar("Numero de cartas inválido");
				break;
			case 20:
				notificar("Não é a sua vez");
				break;
			case -1:
				notificar("erro não tratado");
				break;
			default:
				notificar("erro default");
				break;
		}
	}
}
