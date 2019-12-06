package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

import javax.swing.ImageIcon;
import java.util.List;

public class Carta implements Jogada {
	
	protected int valor;
	protected Naipe naipe;
	protected boolean estaVirada;
	protected ImageIcon imagem;
	
	public Carta() {

	}
	
	public Carta(int valor, Naipe naipe) {
		estaVirada = false;
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public boolean isEstaVirada() {
		return estaVirada;
	}
	public void setEstaVirada(boolean estaVirada) {
		this.estaVirada = estaVirada;
	}
	
	public ImageIcon getImagem() {
		return imagem;
	}
	
	public void setImagem(ImageIcon imageIcon) {
		this.imagem = imagem;
	}

}
