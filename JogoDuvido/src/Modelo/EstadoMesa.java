package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

public class EstadoMesa implements Jogada{
    protected boolean desafiou;
    protected boolean inicioDePartida;
    protected int jogadorDaVez;
    protected int valorDaRodada;
    protected Jogador[] participantes;
    protected Monte monte;

    public boolean isInicioDePartida() {
        return inicioDePartida;
    }

    public void setInicioDePartida(boolean inicioDePartida) {
        this.inicioDePartida = inicioDePartida;
    }

    public int getJogadorDaVez() {
        return jogadorDaVez;
    }

    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }

    public int getValorDaRodada() {
        return valorDaRodada;
    }

    public void setValorDaRodada(int valorDaRodada) {
        this.valorDaRodada = valorDaRodada;
    }

    public Jogador[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Jogador[] participantes) {
        this.participantes = participantes;
    }

    public Monte getMonte() {
        return monte;
    }

    public void setMonte(Monte monte) {
        this.monte = monte;
    }

    public boolean isDesafiou() {
        return desafiou;
    }

    public void setDesafiou(boolean desafiou) {
        this.desafiou = desafiou;
    }
}
