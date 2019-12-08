package InterfaceGrafica;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.List;

import Modelo.Carta;
import Modelo.EstadoMesa;


public class InterfaceMesa extends JFrame{
	

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
	protected JTextPane txtpnUltimaJogada;
	protected JLabel labelQtdAdv1;
	protected JLabel labelQtdAdv;
	protected JLabel labelQtdMonte;
    protected JLabel labelValorRodada;
    protected JLabel lblValorRodada;
    protected JTextPane txtpnAvisos;




	protected AtorJogador atorJogador;




	
	public InterfaceMesa(AtorJogador atorJogador){

		this.atorJogador = atorJogador;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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

			}
		});
		mnOpes.add(mntmIniciarPartida);
		getContentPane().setLayout(null);

		panel = new InterfaceMao(this);
		panel.setBounds(12, 327, 719, 100);
		getContentPane().add(panel);
		setJMenuBar(menuBar);
		
		btnDuvido = new JButton("DUVIDO!");
		btnDuvido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				atorJogador.duvidar();
			}
		});
		btnDuvido.setBounds(319, 290, 114, 25);
		getContentPane().add(btnDuvido);
		
		lblMonte = new JLabel("Monte");
		lblMonte.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonte.setIcon(new ImageIcon(InterfaceMesa.class.getResource("/InterfaceGrafica/Imagens/monte.png")));
		lblMonte.setBounds(319, 105, 87, 90);
		getContentPane().add(lblMonte);

        labelValorRodada = new JLabel("Valor a ser jogado: ");
        labelValorRodada.setFont(new Font("TimesRoman", Font.BOLD, 16));
        labelValorRodada.setForeground(Color.PINK);
        labelValorRodada.setBackground(Color.PINK);
        labelValorRodada.setHorizontalAlignment(SwingConstants.CENTER);
        labelValorRodada.setBounds(250, 40, 200, 80);
        getContentPane().add(labelValorRodada);

        lblValorRodada = new JLabel("Ás");
        lblValorRodada.setFont(new Font("TimesRoman", Font.BOLD, 16));
        lblValorRodada.setForeground(Color.PINK);
        lblValorRodada.setBackground(Color.PINK);
        lblValorRodada.setHorizontalAlignment(SwingConstants.CENTER);
        lblValorRodada.setBounds(420, 40, 80, 80);
        getContentPane().add(lblValorRodada);

		panel_1 = new JPanel();
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
		
		labelQtdAdv = new JLabel("1");
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
		
		labelQtdAdv1 = new JLabel("1");
		labelQtdAdv1.setFont(new Font("Garuda", Font.BOLD, 20));
		labelQtdAdv1.setBounds(12, 57, 34, 99);
		panel_2.add(labelQtdAdv1);
		
		labelQtdMonte = new JLabel("0");
		labelQtdMonte.setForeground(Color.CYAN);
		labelQtdMonte.setBackground(Color.CYAN);
		labelQtdMonte.setFont(new Font("Garuda", Font.BOLD, 20));
		labelQtdMonte.setHorizontalAlignment(SwingConstants.CENTER);
		labelQtdMonte.setBounds(319, 203, 87, 32);
		getContentPane().add(labelQtdMonte);
		
		txtpnUltimaJogada = new JTextPane();
		txtpnUltimaJogada.setEditable(false);
		txtpnUltimaJogada.setBackground(Color.GRAY);
		txtpnUltimaJogada.setText("Não há jogadas no monte");
		txtpnUltimaJogada.setBounds(214, 12, 345, 32);
		getContentPane().add(txtpnUltimaJogada);

		txtpnAvisos = new JTextPane();
		txtpnAvisos.setEditable(false);
		txtpnAvisos.setBackground(Color.LIGHT_GRAY);
		txtpnAvisos.setText("AVISOS");
		txtpnAvisos.setBounds(12, 186, 250, 133);
		txtpnAvisos.setFont(new Font("Garuda", Font.BOLD, 20));
		getContentPane().add(txtpnAvisos);




		

        this.setSize(760, 500);
        this.setVisible(true);
        this.setResizable(true);
	}

	public void enviaMao(List<Carta> cartas){
		atorJogador.enviaMao(cartas);
	}
	public String traduzValor(int valor){

		String resultado = "Valor invalido";

		if(valor == 1){
			resultado = "Ás";
		}else{
			if (valor == 2){
				resultado = "Dois";
			}else{
				if (valor == 3){
					resultado = "Três";
				}else{
					if (valor == 4){
						resultado = "Quatro";
						}else{
						if (valor == 5){
							resultado = "Cinco";
						}else{
							if (valor == 6){
								resultado = "Seis";
							}else{
								if (valor == 7){
									resultado = "Sete";
								}else{
									if (valor == 8){
										resultado = "Oito";
									}else{
										if (valor == 9){
											resultado = "Nove";
										}else{
											if (valor == 10){
												resultado = "Dez";
											}else{
												if (valor == 11){
													resultado = "Valete";
												}else{
													if (valor == 12){
														resultado = "Dama";
													}else{
														if (valor == 13 || valor ==-1){
															resultado = "Rei";
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					}
				}
			}

		return  resultado;
	}

	public int posicaoAdversario(int seuId){
		int resposta = seuId;

		if(seuId == 3){
			resposta = 0;
		}else{
			if(seuId == 2){
                 resposta = 2;
			}else{
				resposta = 1;
			}
		}

		return resposta;
	}
	public int posicaoAdversario2(int seuId){
		int resposta = seuId;

		if(seuId == 3){
			resposta = 1;
		}else{
			if(seuId == 2){
				resposta = 0;
			}else{
				resposta = 2;
			}
		}

		return resposta;
	}

	public void atualizaInterface(EstadoMesa estado){

		System.out.println("Recebeu jogada na interface mesa");
		atualizaInformacoesDePartida(estado);

		if(estado.isInicioDePartida()){
			atualizaNomeJogadores(estado);
		}
		panel.recebeCartas(estado.getParticipantes()[atorJogador.getJogadorLocal().getId()-1].getMao());
		getContentPane().repaint();

	}
	public void atualizaInformacoesDePartida(EstadoMesa estado){

		String ultimaJogada;
		if(estado.isInicioDePartida()||estado.isDesafiou()){
			ultimaJogada = "Não há jogadas no monte";
		}else{
			ultimaJogada = "Ultima jogada: "+ estado.getMonte().getUltimaJogada().size() +" "+ traduzValor(estado.getValorDaRodada()-1)+ "(s)";
		}

		System.out.println(ultimaJogada);
		txtpnUltimaJogada.setText(ultimaJogada);

		String qtdMonte = ""+estado.getMonte().getConteudo().size();
		System.out.println(qtdMonte);
		labelQtdMonte.setText(qtdMonte);

		String qtdAdv = ""+estado.getParticipantes()[posicaoAdversario(atorJogador.getJogadorLocal().getId())].getQtdCartas();
		System.out.println(qtdAdv);
		labelQtdAdv.setText(qtdAdv);

		String qtdAdv1 = ""+estado.getParticipantes()[posicaoAdversario2(atorJogador.getJogadorLocal().getId())].getQtdCartas();
		System.out.println(qtdAdv1);
		labelQtdAdv1.setText(qtdAdv1);

		String valorRodada = ""+traduzValor(estado.getValorDaRodada());
		System.out.println(valorRodada);
		lblValorRodada.setText(valorRodada);

	}
	public void atualizaNomeJogadores(EstadoMesa estado){

		String nomeAdv1 = estado.getParticipantes()[posicaoAdversario(atorJogador.getJogadorLocal().getId())].getNome();
		System.out.println(nomeAdv1);
		lblNomeadversario.setText(nomeAdv1);

		String nomeAdv2 = estado.getParticipantes()[posicaoAdversario2(atorJogador.getJogadorLocal().getId())].getNome();
		System.out.println(nomeAdv2);
		lblNomeadversario_1.setText(nomeAdv2);

	}

	public void notificar(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem);
	}

	public void informaStatus(int status) {
		switch(status) {
			case 0:
				txtpnAvisos.setText("Desconectou com sucesso");
				break;
			case 1:
				notificar("Já desconectado");
				break;
			case 2:
				notificar("Erro de Desconexão");
				break;
			case 3:
				txtpnAvisos.setText("Conectou com sucesso");
				break;
			case 4:
				notificar("Já conectado");
				break;
			case 5:
				notificar("Erro de Conexao");
				break;
			case 6:
				txtpnAvisos.setText("Recebeu nova partida");
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
				txtpnAvisos.setText("Solicitação de início enviada");
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
				txtpnAvisos.setText("Sua vez de jogar");
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
				txtpnAvisos.setText("Jogada sucedida");
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
