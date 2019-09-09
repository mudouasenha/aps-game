package InterfaceGrafica;

public class Main {
    public static void main(String[] args) {
        InterfaceMesa mesa = new InterfaceMesa();
        mesa.setSize(1800, 1500);
        mesa.setVisible(true);
        mesa.setResizable(true);
    }
}