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
        int valor = 1;
        carta1.setValor(valor);
        carta1.setNaipe(Naipe.OURO);
        
        ArrayList<Carta> mao = new ArrayList<Carta>();

        
		
		ArrayList<JLabel> cartas = new ArrayList<JLabel>(interfaceMesa.laborizar(mao));
		
		interfaceMesa.adicionarItensLista(cartas);
		
		interfaceMesa.atualizaCartas(cartas);
        
        interfaceMesa.ator = new AtorJogador(mesa);
        interfaceMesa.ator.jogadorLocal = new Jogador("Matheus", 1);
        interfaceMesa.lblNomeadversario.setText("Matheus");
        interfaceMesa.lblNomeadversario_1.setText("Samuel");


        
        
    }
}