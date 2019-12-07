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
    protected Mesa mesa;



    public AtorNetgames(Mesa mesa) {
        super();
        this.proxy = Proxy.getInstance();
        proxy.addOuvinte(this);
        this.mesa = mesa;
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
            this.proxy.iniciarPartida(new Integer(3));
        } catch (NaoConectadoException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }





    @Override
    public void iniciarNovaPartida(Integer ordem) {

        System.out.println("Recebeu inicio de partida: " + ordem);

        if(ordem.equals(1)){
            System.out.println("É o primeiro");
            String adv1 = proxy.obterNomeAdversario(2);
            String adv2 = proxy.obterNomeAdversario(3);

            System.out.println(adv1);
            System.out.println(adv2);

            mesa.iniciarNovaPartida(adv1, adv2);
        }else{
            if(ordem == 2){
                mesa.getAtorJogador().getJogadorLocal().setId(2);
            }else{
                mesa.getAtorJogador().getJogadorLocal().setId(3);
            }
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
        System.out.println("Recebeu jogada no ator netgames");
        this.mesa.receberJogada((EstadoMesa) jogada);
    }

    @Override
    public void tratarConexaoPerdida() {
        return;
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        return;
    }

    public void enviarJogada(EstadoMesa estadoMesa)  {
        try {
            proxy.enviaJogada(estadoMesa);
        } catch (NaoJogandoException e) {
            System.out.println("Não está jogando");
        }
    }
}
