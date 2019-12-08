package InterfaceGrafica;

import java.util.ArrayList;
import java.util.List;


import javax.swing.ImageIcon;

import Modelo.Carta;
import Modelo.EstadoMesa;
import Modelo.Jogador;
import Modelo.Mesa;
import Rede.AtorNetgames;
import InterfaceGrafica.InterfaceMesa;

public class AtorJogador {

	protected InterfaceMesa intefaceMesa;
	protected Mesa mesaDeJogo;
	protected Jogador jogadorLocal;

	public AtorJogador() {
		this.intefaceMesa = new InterfaceMesa(this);
	}

public AtorJogador(Mesa mesaDeJogo) {
	this.intefaceMesa = new InterfaceMesa(this);
	this.mesaDeJogo = mesaDeJogo;
}

	public InterfaceMesa getIntefaceMesa() {
		return intefaceMesa;
	}

	public void setJogadorLocal(Jogador jogadorLocal) {
		this.jogadorLocal = jogadorLocal;
	}



public void setServidor(String servidor) { this.mesaDeJogo.setServidor(servidor); }

public void conectar(String nome) {
	int status = this.mesaDeJogo.conectar(nome);
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

public void enviaMao(List<Carta> cartas){
	int status = mesaDeJogo.realizaJogada(cartas);
	intefaceMesa.informaStatus(status);
}

public void duvidar() {
	int status;
	int atual = getUltimoAJogar();
	if(atual == this.getJogadorLocal().getId()) {
		status = 11;
	} else {
		status = mesaDeJogo.desafiaJogada();
	}

	this.intefaceMesa.informaStatus(status);
}

	public int getUltimoAJogar() {
		return mesaDeJogo.getMonte().getIdUltimoJogador();
	}

	public void atualizaInterface(EstadoMesa jogada){
		intefaceMesa.atualizaInterface(jogada);
}

}


