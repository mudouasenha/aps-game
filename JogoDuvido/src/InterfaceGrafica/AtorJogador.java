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

public Jogador getJogadorLocal() {
	return jogadorLocal;
}

public boolean desconectar() {
	return this.mesaDeJogo.desconectar();
}

public int duvidar() {
	Jogador atual = this.mesaDeJogo.getJogadorAtual();
	if(atual == this.getJogadorLocal()) {
		return 11;
	}

	int status = mesaDeJogo.desafiaJogada();
	if(status == 12) {
		Jogador perdedor = this.mesaDeJogo.getJogadorAtual();
	} else if (status == 13){
		Jogador perdedor = this.getJogadorLocal();
	} else { // MUDAR
		return -1;
	}

	return status;
}
	//public ArrayList<Carta> leMaoLocal(){

	//}

}
