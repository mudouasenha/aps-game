package InterfaceGrafica;

import java.util.ArrayList;

import javax.swing.JLabel;

import Modelo.Carta;
import Modelo.Jogador;
import Modelo.Naipe;
import Modelo.ValorDeCarta;

public class Main {
    public static void main(String[] args) {
        InterfaceMesa mesa = new InterfaceMesa();
        Carta carta1 = new Carta();
        ValorDeCarta valor = ValorDeCarta.A;
        carta1.setValor(valor);
        carta1.setNaipe(Naipe.OURO);
        
        ArrayList<Carta> mao = new ArrayList<Carta>();
		mao.add(new Carta(valor, Naipe.OURO));
		mao.add(new Carta(valor, Naipe.OURO));
		mao.add(new Carta(valor, Naipe.OURO));
        
		System.out.println(mesa.iconizar(mao));
		
		ArrayList<JLabel> cartas = new ArrayList<JLabel>(mesa.laborizar(mao));
		
		mesa.adicionarItensLista(cartas);
		
		mesa.atualizaCartas(cartas);
		System.out.println(cartas);
        
        mesa.ator = new AtorJogador();
        mesa.ator.jogadorLocal = new Jogador();
        mesa.lblNomeadversario.setText("Matheus");
        mesa.lblNomeadversario_1.setText("Samuel");
        
        
    }
}