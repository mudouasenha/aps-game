package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;

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
	
	public InterfaceMesa(){
		
		
		this.getContentPane().setBackground(new Color(0, 100, 0));

		menuBar = new JMenuBar();
		
		mnOpes = new JMenu("Opções");
		
		menuBar = new JMenuBar();
		menuBar.add(mnOpes);
		
		mntmConectar = new JMenuItem("Conectar");
		mnOpes.add(mntmConectar);
		
		mntmDesconectar = new JMenuItem("Desconectar");
		mnOpes.add(mntmDesconectar);
		
		mntmIniciarPartida = new JMenuItem("Iniciar Partida");
		mnOpes.add(mntmIniciarPartida);
		getContentPane().setLayout(null);
		
		panel_1 = new JPanel();
		panel = new InterfaceMao(ator.leMaoLocal());
		panel.setBounds(0, 329, 719, 100);
		getContentPane().add(panel);
		setJMenuBar(menuBar);
		
		btnDuvido = new JButton("DUVIDO!");
		btnDuvido.setBounds(269, 292, 114, 25);
		getContentPane().add(btnDuvido);
		
		lblMonte = new JLabel("Monte");
		lblMonte.setIcon(new ImageIcon(InterfaceMesa.class.getResource("/InterfaceGrafica/Imagens/monte.png")));
		lblMonte.setBounds(319, 105, 87, 88);
		getContentPane().add(lblMonte);
		
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(12, 12, 133, 169);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNomeadversario = new JLabel("nomeAdversario1");
		lblNomeadversario.setBounds(12, 12, 109, 22);
		panel_1.add(lblNomeadversario);
		
		lblImgcartas = new JLabel("imgCartas");
		lblImgcartas.setBounds(12, 57, 70, 100);
		panel_1.add(lblImgcartas);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(574, 12, 133, 169);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNomeadversario_1 = new JLabel("nomeAdversario2");
		lblNomeadversario_1.setBounds(12, 12, 109, 22);
		panel_2.add(lblNomeadversario_1);
		
		labelImgCartas1 = new JLabel("imgCartas");
		labelImgCartas1.setBounds(51, 57, 70, 100);
		panel_2.add(labelImgCartas1);
		
        this.setSize(760, 500);
        this.setVisible(true);
        this.setResizable(true);
	}
}
