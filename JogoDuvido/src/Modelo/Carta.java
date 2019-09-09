package Modelo;

import javax.swing.ImageIcon;

public class Carta {
	
	protected ValorDeCarta valor;
	protected Naipe naipe;
	protected boolean estaVirada;
	protected ImageIcon imagem;
	
	public Carta() {

	}
	
	public Carta(ValorDeCarta valor, Naipe naipe) {
		estaVirada = false;
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public ValorDeCarta getValor() {
		return valor;
	}
	public void setValor(ValorDeCarta valor) {
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
