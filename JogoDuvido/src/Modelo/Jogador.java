package Modelo;

import java.util.List;

public class Jogador {
	
	protected List<Carta> mao;
	protected String nome;
	protected int qtdCartas;
	
	
	
	public List<Carta> getMao() {
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
	
	

}
