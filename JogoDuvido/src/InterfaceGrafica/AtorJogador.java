package InterfaceGrafica;

import java.util.ArrayList;
import java.util.List;


import javax.swing.ImageIcon;

import Modelo.Carta;
import Modelo.Jogador;
import Modelo.Mesa;
import Rede.AtorNetgames;
import InterfaceGrafica.InterfaceMesa;

public class AtorJogador {
	
	protected AtorNetgames netgames;
	protected InterfaceMesa intefaceMesa;
	protected Mesa mesaDeJogo;
	protected Jogador jogadorLocal;
	
public AtorJogador(Mesa mesaDeJogo) {
	//this.intefaceMesa = new InterfaceMesa(this);
	this.mesaDeJogo = mesaDeJogo;
}

public boolean conectar() {
	return this.mesaDeJogo.conectar();
}

public boolean desconectar() {
	return this.mesaDeJogo.desconectar();
}


	//public ArrayList<Carta> leMaoLocal(){

	//}

}
