package InterfaceGrafica;

import java.util.ArrayList;

import javax.swing.JLabel;

import Modelo.*;
import InterfaceGrafica.AtorJogador;

public class Main {
    public static void main(String[] args) {

        Mesa mesa = new Mesa();
        AtorJogador atorJogador = new AtorJogador(mesa);
        InterfaceMesa interfaceMesa = new InterfaceMesa(atorJogador);
        Carta carta1 = new Carta();
        ValorDeCarta valor = ValorDeCarta.A;
        carta1.setValor(valor);
        carta1.setNaipe(Naipe.OURO);
        
        ArrayList<Carta> mao = new ArrayList<Carta>();
		mao.add(new Carta(valor, Naipe.OURO));
		mao.add(new Carta(valor, Naipe.OURO));
		mao.add(new Carta(valor, Naipe.OURO));
        
		
		ArrayList<JLabel> cartas = new ArrayList<JLabel>(interfaceMesa.laborizar(mao));
		
		interfaceMesa.adicionarItensLista(cartas);
		
		interfaceMesa.atualizaCartas(cartas);
        
        interfaceMesa.ator = new AtorJogador(mesa);
        interfaceMesa.ator.jogadorLocal = new Jogador("Matheus");
        interfaceMesa.lblNomeadversario.setText("Matheus");
        interfaceMesa.lblNomeadversario_1.setText("Samuel");


        
        
    }
}