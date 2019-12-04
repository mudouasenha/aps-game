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
	protected String servidor;
	
public AtorJogador(Mesa mesaDeJogo) {
	this.intefaceMesa = new InterfaceMesa(this);
	this.mesaDeJogo = mesaDeJogo;
}

public String getServidor() { return servidor; }

public void setServidor(String servidor) { this.servidor = servidor; }

public void conectar() {
	int status = this.mesaDeJogo.conectar();
	this.intefaceMesa.informaStatus(status);
}

public Jogador getJogadorLocal() {
	return jogadorLocal;
}

public void desconectar() {
	int status = this.mesaDeJogo.desconectar();
	this.intefaceMesa.informaStatus(status);
}

public void iniciarPartida() {
	int status = this.mesaDeJogo.iniciarPartida();
	this.intefaceMesa.informaStatus(status);
}

public void duvidar() {
	int status;
	Jogador atual = this.mesaDeJogo.getJogadorAtual();
	if(atual == this.getJogadorLocal()) {
		status = 11;
	} else {
		status = mesaDeJogo.desafiaJogada();
	}
	if(status == 12) {
		Jogador perdedor = this.mesaDeJogo.getJogadorAtual();
	} else if (status == 13){
		Jogador perdedor = this.getJogadorLocal();
	} else { // MUDAR

	}
	this.intefaceMesa.informaStatus(status);
}

}


