package InterfaceGrafica;

import java.util.ArrayList;

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
        mesa.ator = new AtorJogador();
        mesa.ator.jogadorLocal = new Jogador();
        ArrayList<Carta> array = new ArrayList<>();
        array.add(carta1);
        mesa.ator.jogadorLocal.setMao(array);
        mesa.panel.atualizaMao(mesa.ator.leMaoLocal());
        mesa.lblNomeadversario.setText("Matheus");
        mesa.lblNomeadversario_1.setText("Samuel");
        
        
    }
}