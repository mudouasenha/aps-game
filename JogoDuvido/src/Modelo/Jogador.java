package Modelo;


import br.ufsc.inf.leobr.cliente.Jogada;

import java.util.List;

public class Jogador implements Jogada {
	
	protected List<Carta> mao;
	protected String nome;
	protected int id;
	
	
	
	public void setMao(List<Carta> cartas) {
		this.mao = cartas;
	}
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
		return mao.size();
	}
	public int getId() { return id;}
	public void setId(int id) {this.id = id;}
	
	public Jogador (String nome, int id) {
		this.nome = nome;
		this.id = id;
		//this.daVez = false;
	}


	public void retiraCartasDaMao(List<Carta>  cartas) {
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
