package Modelo;

import java.util.ArrayList;

public class Jogador {
	
	protected ArrayList<Carta> mao;
	protected String nome;
	protected int qtdCartas;
	protected boolean daVez;
	
	
	
	public void setMao(ArrayList<Carta> cartas) {
		this.mao = cartas;
	}
	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdCartas() {
		return qtdCartas;
	}
	public void setQtdCartas(int qtdCartas) {
		this.qtdCartas = qtdCartas;
	}
	public boolean isDaVez() { return daVez; }
	public void setDaVez(boolean daVez) { this.daVez = daVez;	}
	
	public Jogador (String nome) {
		this.nome = nome;
		this.daVez = false;
	}

}
