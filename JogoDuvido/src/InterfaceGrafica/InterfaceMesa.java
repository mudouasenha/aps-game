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

public class InterfaceMesa extends JFrame{
	public InterfaceMesa() {
		getContentPane().setBackground(new Color(0, 100, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmConectar = new JMenuItem("Conectar");
		menuBar.add(mntmConectar);
		
		JMenuItem mntmDesconectar = new JMenuItem("Desconectar");
		menuBar.add(mntmDesconectar);
		
		JMenuItem mntmIniciarPartida = new JMenuItem("Iniciar Partida");
		menuBar.add(mntmIniciarPartida);
		getContentPane().setLayout(null);
		
		JPanel panel = new InterfaceMao();
		panel.setBounds(0, 329, 719, 100);
		getContentPane().add(panel);
		
		JButton btnDuvido = new JButton("DUVIDO!");
		btnDuvido.setBounds(269, 292, 114, 25);
		getContentPane().add(btnDuvido);
		
		JLabel lblMonte = new JLabel("Monte");
		lblMonte.setBounds(317, 136, 66, 15);
		getContentPane().add(lblMonte);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(12, 12, 133, 169);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNomeadversario = new JLabel("nomeAdversario1");
		lblNomeadversario.setBounds(12, 12, 109, 22);
		panel_1.add(lblNomeadversario);
		
		JLabel lblImgcartas = new JLabel("imgCartas");
		lblImgcartas.setBounds(12, 57, 70, 100);
		panel_1.add(lblImgcartas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(574, 12, 133, 169);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNomeadversario_1 = new JLabel("nomeAdversario2");
		lblNomeadversario_1.setBounds(12, 12, 109, 22);
		panel_2.add(lblNomeadversario_1);
		
		JLabel label = new JLabel("imgCartas");
		label.setBounds(51, 57, 70, 100);
		panel_2.add(label);
	}
}
