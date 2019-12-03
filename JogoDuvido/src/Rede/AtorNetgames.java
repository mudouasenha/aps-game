package Rede;

import InterfaceGrafica.AtorJogador;
import Modelo.*;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.*;

import javax.swing.*;

public class AtorNetgames implements OuvidorProxy {
    private static final long serialVersionUID = 1L;
    protected Proxy proxy;
    protected AtorJogador jogador;
    protected Mesa mesa;



    public AtorNetgames(Mesa mesa) {
        super();
        this.jogador = jogador;
        this.proxy = Proxy.getInstance();
        this.proxy.addOuvinte(this);
    }

    public boolean conectar(String servidor, String nome) {
        try {
            this.proxy.conectar(servidor, nome);
        } catch (JahConectadoException | NaoPossivelConectarException | ArquivoMultiplayerException | NullPointerException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean desconectar() {
        try {
            this.proxy.desconectar();
        } catch (NaoConectadoException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean iniciarPartida() {
        try {
            this.proxy.iniciarPartida(3);
        } catch (NaoConectadoException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String obterNomeAdversarios() {
        String nome = "matheus";
        return nome;
    }

    //public void enviarJogada(Modelo.Jogada jogada) {
    //    try {
    //    this.proxy.enviaJogada(jogada);
    //    } catch (NaoJogandoException e) {
    //        e.printStackTrace();
    //    }
    //}



    @Override
    public void iniciarNovaPartida(Integer ordem) {

        if(ordem == 1){
            String adv1 = proxy.obterNomeAdversario(2);
            String adv2 = proxy.obterNomeAdversario(3);

            mesa.iniciarNovaPartida(adv1, adv2);
        }


    }

    @Override
    public void finalizarPartidaComErro(String message) {

        return;
    }

    @Override
    public void receberMensagem(String msg) {
        return;
    }

    @Override
    public void receberJogada(Jogada jogada) {
        this.mesa.receberJogada((Mesa) jogada);
    }

    @Override
    public void tratarConexaoPerdida() {
        return;
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        return;
    }

    public void enviarJogada(Mesa estadoMesa)  {
        try {
            proxy.enviaJogada(estadoMesa);
        } catch (NaoJogandoException e) {
            System.out.println("Não está jogando");
        }
    }
}
