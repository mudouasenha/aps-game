package Modelo;

import InterfaceGrafica.AtorJogador;
import Rede.AtorNetgames;
import br.ufsc.inf.leobr.cliente.Jogada;

import java.util.ArrayList;
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
			this.jogador = new Jogador(nomeJogador, 1);
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

	public void repassaCartas(int idDestino, List<Carta> cartas) {

		Jogador perdedor = participantes[idDestino-1];
		ArrayList<Carta> mao = perdedor.getMao();

		for(Carta c : cartas){
			mao.add(c);
		}
		perdedor.setMao(mao);


	}

	public int desafiaJogada() {
		int status = -1;
		//.......
		boolean blefou = verificaBlefe();
		int idPerdedor = -1;
		if(blefou){
			idPerdedor = getJogadorAtual().getId();
			status = 12;
		}else{
			idPerdedor = atorJogador.getJogadorLocal().getId();
			status = 13;
		}

		List<Carta> cartas = monte.esvaziaMonte();

		repassaCartas(idPerdedor, cartas);

		enviaJogada();

		return status;
	}

	public int realizaJogada(Carta[] cartas){
		int maoStatus = analisaMao(cartas);
		if(maoStatus==18){
			jogaNoMonte(cartas);
			enviaJogada();
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


	public void iniciarPartida() {

	}

	public void receberJogada(Mesa jogada) {
	}

	public void enviaJogada(){
		atorNetGames.enviarJogada(this);
	}

	public void iniciarNovaPartida(String adv1, String adv2) {
		limpaMesa();

		Carta[] baralho = criaBaralhoEmbaralhado();

		Carta[] mao ;

		participantes[0] = new Jogador(atorJogador.getJogadorLocal().getNome(), 1);
		mao = distribuiCartasParaJogador(baralho);
		participantes[0].setMao(null);

		participantes[1] = new Jogador(adv1, 2);
		mao = distribuiCartasParaJogador(baralho);
		participantes[1].setMao(null);

		participantes[2] = new Jogador(adv2, 3);
		mao = distribuiCartasParaJogador(baralho);
		participantes[2].setMao(null);

		enviaJogada();


	}

	private Carta[] distribuiCartasParaJogador(Carta[] baralho) {
		return null;
	}

	private Carta[] criaBaralhoEmbaralhado() {
		return null;
	}

	private void limpaMesa() {
	}
}
