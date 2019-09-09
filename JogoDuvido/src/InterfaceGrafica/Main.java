package InterfaceGrafica;

import Modelo.Carta;
import Modelo.Naipe;
import Modelo.ValorDeCarta;

public class Main {
    public static void main(String[] args) {
        InterfaceMesa mesa = new InterfaceMesa();
        InterfaceMao mao = new InterfaceMao();
        Carta carta1 = new Carta();
        ValorDeCarta valor = ValorDeCarta.A;
        carta1.setValor(valor);
        carta1.setNaipe(Naipe.OURO);
        mesa.ator = new AtorJogador();
        mesa.lblNomeadversario.setText("Matheus");
        mesa.lblNomeadversario_1.setText("Samuel");
        
        
    }
}