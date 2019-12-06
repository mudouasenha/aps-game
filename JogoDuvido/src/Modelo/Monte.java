package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

import java.util.ArrayList;
import java.util.List;

public class Monte implements Jogada {
	
	protected List<Carta> conteudo;
	protected List<Carta>  ultimaJogada;
	protected int idUltimoJogador;

	public Monte(){
		conteudo = new ArrayList<Carta>();
		ultimaJogada = new ArrayList<Carta>();
	}
	
	public List<Carta> getConteudo() {
		return conteudo;
	}
	public void setConteudo(List<Carta> conteudo) {
		this.conteudo = conteudo;
	}
	public List<Carta>  getUltimaJogada() {
		return ultimaJogada;
	}
	public void setUltimaJogada(List<Carta>  ultimaJogada) {
		this.ultimaJogada = ultimaJogada;
	}
	public List<Carta> esvaziaMonte() {
		List<Carta> cartas = getConteudo();
		setConteudo(new ArrayList<Carta>()); // mudar;
		return cartas;
    }

	public int getIdUltimoJogador() {
		return idUltimoJogador;
	}

	public void setIdUltimoJogador(int idUltimoJogador) {
		this.idUltimoJogador = idUltimoJogador;
	}
}
