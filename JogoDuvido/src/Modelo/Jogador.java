package Modelo;

import java.util.ArrayList;

public class Jogador {
	
	protected ArrayList<Carta> mao;
	protected String nome;
	protected int qtdCartas;
	protected boolean daVez;
	protected int id;
	
	
	
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
	public int getId() { return id;}
	public void setId(int id) {this.id = id;}
	
	public Jogador (String nome) {
		this.nome = nome;
		this.daVez = false;
	}


	public void retiraCartasDaMao(Carta[] cartas) {
		for (Carta c : cartas) {
			for (Carta c0 : mao){
				if(c0.getValor() == c.getValor()){
					if(c0.getNaipe()==c.getNaipe()){
						mao.remove(c0);
					}
				}
			}
		}
	}
}
