package InterfaceGrafica;

import Modelo.Carta;

public class Main {
    public static void main(String[] args) {
        InterfaceMesa mesa = new InterfaceMesa();
        Carta carta1 = new Carta();
        mesa.lblNomeadversario.setText("Matheus");
        mesa.lblNomeadversario_1.setText("Samuel");
        
        
    }
}