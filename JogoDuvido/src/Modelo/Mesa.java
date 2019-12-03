package Modelo;

import InterfaceGrafica.AtorJogador;
import Rede.AtorNetgames;
import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.List;

public class Mesa implements Jogada {
	
	protected Monte monte;
	protected int numeroDaRodada;
	protected Jogador[] participantes;
	protected Jogador jogador;
	protected boolean conectado;
	protected AtorNetgames atorNetGames;
	protected AtorJogador atorJogador;
	protected boolean jogoEmAndamento;
	protected String servidor = "";
	protected int idDaVez;
	
	
	public int getNumeroDaRodada() {
		return numeroDaRodada;
	}
	public void setNumeroDaRodada(int numeroDaRodada) {
		this.numeroDaRodada = numeroDaRodada;
	}
	public Jogador getJogadorAtual() {
		int id = -1;
		// ...........
		// ...........
		return participantes[id];
	}
	public Monte getMonte() {
		return monte;
	}
	public Jogador[] getParticipantes() {
		return participantes;
	}
	
	public Mesa() {
		this.atorNetGames = new AtorNetgames(this);
		this.atorJogador = new AtorJogador(this);
		this.conectado = false;
		this.jogoEmAndamento = false;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public boolean conectar() {
		if(!this.conectado) {
			String servidor = "localhost";
			String nomeJogador = "matheus";
			this.jogador = new Jogador(nomeJogador);
			boolean conectado = this.atorNetGames.conectar(servidor, nomeJogador);
			if (conectado) {
				this.conectado = true;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean desconectar() {
		if(this.conectado) {
			boolean desconectou = this.atorNetGames.desconectar();
			if (desconectou) {
				this.conectado = false;
				this.jogoEmAndamento = false;
				return true;
			} else {
				return false;
			}
		}	else {
				return false;
			}
	}

	public boolean verificaBlefe() {
		return true;
	}

	public void repassaCartas() {

	}

	public int desafiaJogada() {
		//.......
		boolean blefou = false;
		List<Carta> cartas = monte.esvaziaMonte();
		return 12;
	}

	public int realizaJogada(Carta[] cartas){
		int maoStatus = analisaMao(cartas);
		if(maoStatus==18){
			jogaNoMonte(cartas);
			//envia jogada
		}
		return maoStatus;
	}

	private void jogaNoMonte(Carta[] cartas) {
		monte.setUltimaJogada(cartas);
		List<Carta> m = monte.getConteudo();
		for (Carta c : cartas) {
			m.add(c);
		}
		monte.setConteudo(m);
		monte.setIdUltimoJogador(atorJogador.getJogadorLocal().getId());
		participantes[atorJogador.getJogadorLocal().getId()-1].retiraCartasDaMao(cartas);


	}

	private int analisaMao(Carta[] cartas) {
		int retorno = 18;
		if((cartas.length > 4) || (cartas.length <1) ){
			retorno = 19;
		}else{
			if(atorJogador.getJogadorLocal().getId()!=idDaVez){
				retorno = 20;
			}
		}
		return retorno;
	}


	public void iniciarNovaPartida(int ordem) {

	}

	public void receberJogada(Mesa jogada) {
	}
}
