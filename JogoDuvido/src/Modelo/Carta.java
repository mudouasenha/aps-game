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
		geraImagem(valor,naipe);
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

	public void geraImagem(int valor, Naipe naipe){

				switch(naipe) {
					case OURO : {
						switch(valor) {
							case 1 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png"))));
							case 2 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/2A.png"))));
							case 3 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/3A.png"))));
							case 4 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/4A.png"))));
							case 5 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/5A.png"))));
							case 6 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/6A.png"))));
							case 7 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/7A.png"))));
							case 8 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/8A.png"))));
							case 9 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/9A.png"))));
							case 10 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/10A.png"))));
							case 11 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/11A.png"))));
							case 12 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/12A.png"))));
							case 13 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/13A.png"))));
						}
					}
					case COPAS : {
						switch(valor) {
							case 1 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1B.png"))));
							case 2 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/2B.png"))));
							case 3 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/3B.png"))));
							case 4 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/4B.png"))));
							case 5 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/5B.png"))));
							case 6 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/6B.png"))));
							case 7 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/7B.png"))));
							case 8 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/8B.png"))));
							case 9 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/9B.png"))));
							case 10 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/10B.png"))));
							case 11 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/11B.png"))));
							case 12 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/12B.png"))));
							case 13 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/13B.png"))));
						}}
					case ESPADAS : {
						switch(valor) {
							case 1 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1C.png"))));
							case 2 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/2C.png"))));
							case 3 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/3C.png"))));
							case 4 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/4C.png"))));
							case 5 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/5C.png"))));
							case 6 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/6C.png"))));
							case 7 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/7C.png"))));
							case 8 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/8C.png"))));
							case 9 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/9C.png"))));
							case 10 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/10C.png"))));
							case 11 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/11C.png"))));
							case 12 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/12C.png"))));
							case 13 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/13C.png"))));
						}}
					case PAUS : {
						switch(valor) {
							case 1 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1D.png"))));
							case 2 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/2D.png"))));
							case 3 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/3D.png"))));
							case 4 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/4D.png"))));
							case 5 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/5D.png"))));
							case 6 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/6D.png"))));
							case 7 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/7D.png"))));
							case 8 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/8D.png"))));
							case 9 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/9D.png"))));
							case 10 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/10D.png"))));
							case 11 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/11D.png"))));
							case 12 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/12D.png"))));
							case 13 : this.setImagem((new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/13D.png"))));
						}
					}
				}




	}

}
