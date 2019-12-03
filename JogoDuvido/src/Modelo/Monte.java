package Modelo;

import java.util.List;

public class Monte {
	
	protected List<Carta> conteudo;
	protected Carta[] ultimaJogada;
	
	
	
	public List<Carta> getConteudo() {
		return conteudo;
	}
	public void setConteudo(List<Carta> conteudo) {
		this.conteudo = conteudo;
	}
	public Carta[] getUltimaJogada() {
		return ultimaJogada;
	}
	public void setUltimaJogada(Carta[] ultimaJogada) {
		this.ultimaJogada = ultimaJogada;
	}
	public List<Carta> esvaziaMonte() {
		List<Carta> cartas = getConteudo();
		setConteudo(null); // mudar;
		return cartas;
    }
}
