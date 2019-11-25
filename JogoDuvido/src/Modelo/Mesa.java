package Modelo;

import InterfaceGrafica.AtorJogador;
import Rede.AtorNetgames;
import br.ufsc.inf.leobr.cliente.Jogada;

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
	
	
	public int getNumeroDaRodada() {
		return numeroDaRodada;
	}
	public void setNumeroDaRodada(int numeroDaRodada) {
		this.numeroDaRodada = numeroDaRodada;
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

	public void iniciarNovaPartida(int ordem) {

	}

	public void receberJogada(Mesa jogada) {
	}
}
