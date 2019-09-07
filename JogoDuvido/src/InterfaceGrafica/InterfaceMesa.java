package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 329, 719, 100);
		getContentPane().add(panel);
		
		JLabel lblJogador = new JLabel("Jogador2");
		lblJogador.setBounds(48, 41, 66, 15);
		getContentPane().add(lblJogador);
		
		JLabel lblJogador_1 = new JLabel("Jogador3");
		lblJogador_1.setBounds(599, 41, 66, 15);
		getContentPane().add(lblJogador_1);
		
		JButton btnDuvido = new JButton("DUVIDO!");
		btnDuvido.setBounds(269, 292, 114, 25);
		getContentPane().add(btnDuvido);
		
		JLabel lblMonte = new JLabel("Monte");
		lblMonte.setBounds(292, 139, 66, 15);
		getContentPane().add(lblMonte);
	}
}
