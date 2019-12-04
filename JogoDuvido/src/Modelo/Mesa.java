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
	protected int valorAtualDaRodada;
	protected int idVencedor;
	
	
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
		boolean blefou = false;

		for (Carta c : monte.getUltimaJogada()){
			if(c.getValor()!=valorAtualDaRodada){
				blefou = true;
			}
		}

		return blefou;
	}

	public void repassaCartas(int idDestino, List<Carta> cartas) {

		Jogador perdedor = participantes[idDestino-1];
		List<Carta> mao = perdedor.getMao();

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
			idPerdedor = monte.getIdUltimoJogador();
			status = 12;
		}else{
			idPerdedor = atorJogador.getJogadorLocal().getId();
			status = 13;
		}

		List<Carta> cartas = monte.esvaziaMonte();

		repassaCartas(idPerdedor, cartas);

		enviaJogada(1);

		return status;
	}

	public int realizaJogada(List<Carta>  cartas){
		int maoStatus = analisaMao(cartas);
		if(maoStatus==18){
			jogaNoMonte(cartas);
			incrementaValorDaRodada();
			proximoJogador();
			enviaJogada(0);
		}
		return maoStatus;
	}

	private void proximoJogador() {

		if(idDaVez<3){
			idDaVez++;
		}else{
			idDaVez = 1;
		}

	}

	private void incrementaValorDaRodada() {
		if(valorAtualDaRodada<13){
			valorAtualDaRodada++;
		}else{
			valorAtualDaRodada = 1;
		}
	}

	private void jogaNoMonte(List<Carta>  cartas) {
		monte.setUltimaJogada(cartas);
		List<Carta> m = monte.getConteudo();
		for (Carta c : cartas) {
			m.add(c);
		}
		monte.setConteudo(m);
		monte.setIdUltimoJogador(atorJogador.getJogadorLocal().getId());
		participantes[atorJogador.getJogadorLocal().getId()-1].retiraCartasDaMao(cartas);


	}

	private int analisaMao(List<Carta>  cartas) {
		int retorno = 18;
		if((cartas.size() > 4) || (cartas.size()<1) ){
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

	public void receberJogada(EstadoMesa jogada) {
		int status = analisaJogada(jogada);

		atualizaInformacoes(jogada);
	}

	private void atualizaInformacoes(EstadoMesa jogada) {
	}

	private int analisaJogada(EstadoMesa jogada) {
		int resultado = -1;
		if(jogada.getJogadorDaVez() == atorJogador.getJogadorLocal().getId()){
			resultado = 14;
		}else{
			// ...
		}

		return resultado;
	}

	public void enviaJogada(int tipo){

		EstadoMesa jogada = geraEstadoJogada() ;

		if(tipo == 1){
			jogada.setDesafiou(true);
		}else{
			if(tipo ==2){
				jogada.setInicioDePartida(true);
			}else{
				analisaVencedor();
				if(idVencedor!=  0){
					jogada.setIdVencedor(idVencedor);
				}
			}
		}

		atorNetGames.enviarJogada(jogada);
	}

	private void analisaVencedor() {
		for(int i=0; i<3;i++){
			if(participantes[i].getMao().size() == 0){
				idVencedor = i+1;
			}
		}
	}

	private EstadoMesa geraEstadoJogada() {
		EstadoMesa estado = new EstadoMesa();
		estado.setJogadorDaVez(this.idDaVez);
		estado.setMonte(this.monte);
		estado.setParticipantes(this.participantes);
		estado.setValorDaRodada(this.valorAtualDaRodada);
		return estado;
	}



	public void iniciarNovaPartida(String adv1, String adv2) {
		limpaMesa();

		Carta[] baralho = criaBaralhoEmbaralhado();

		List<Carta>  mao ;

		participantes[0] = new Jogador(atorJogador.getJogadorLocal().getNome(), 1);
		mao = distribuiCartasParaJogador(baralho);
		participantes[0].setMao(mao);

		participantes[1] = new Jogador(adv1, 2);
		mao = distribuiCartasParaJogador(baralho);
		participantes[1].setMao(mao);

		participantes[2] = new Jogador(adv2, 3);
		mao = distribuiCartasParaJogador(baralho);
		participantes[2].setMao(mao);

		enviaJogada(2);


	}

	private List<Carta> distribuiCartasParaJogador(Carta[] baralho) {
		List<Carta> mao = new ArrayList<Carta>();
		int inicioLoop ;
		int fimLoop ;

		if(baralho[0]!=null){
			inicioLoop = 0;
			fimLoop = 18;
		}else{
			if(baralho[18]!=null){
				inicioLoop = 18;
				fimLoop = 35;
			}else {
				inicioLoop = 35;
				fimLoop = 52;
			}
		}

		for(int i = inicioLoop; i<fimLoop; i++){
			mao.add(baralho[i]);
			baralho[i] = null;
		}

		return mao;
	}

	private Carta[]  criaBaralhoEmbaralhado() {
		return null;
	}

	private void limpaMesa() {
	}
}
