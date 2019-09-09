package InterfaceGrafica;

import java.util.ArrayList;
import java.util.List;


import javax.swing.ImageIcon;

import Modelo.Carta;
import Modelo.Mesa;
import Rede.AtorNetgames;

public class AtorJogador {
	
	protected AtorNetgames netgames;
	protected Mesa mesaDeJogo;
	
	public ArrayList<ImageIcon> iconizador(List<Carta> deque){
		
		ArrayList<ImageIcon> imagens = new ArrayList<ImageIcon>();
		for(Carta carta : deque) {
			if (carta.isEstaVirada()) {
				imagens.add(new ImageIcon(getClass().getResource("1A.jpg")));
			}else {
				switch(carta.getNaipe()) {
				case OURO : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon(getClass().getResource("/InterfaceGrafica/Imagens/1A.png")));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
					}
				}
				case COPAS : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon("path"));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
				}}
				case ESPADAS : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon("path"));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
				}}
				case PAUS : {
					switch(carta.getValor()) {
					case A : imagens.add(new ImageIcon("path"));
					case DOIS : imagens.add(new ImageIcon("path"));
					case TRES : imagens.add(new ImageIcon("path"));
					case QUATRO : imagens.add(new ImageIcon("path"));
					case CINCO : imagens.add(new ImageIcon("path"));
					case SEIS : imagens.add(new ImageIcon("path"));
					case SETE : imagens.add(new ImageIcon("path"));
					case OITO : imagens.add(new ImageIcon("path"));
					case NOVE : imagens.add(new ImageIcon("path"));
					case DEZ : imagens.add(new ImageIcon("path"));
					case J : imagens.add(new ImageIcon("path"));
					case Q : imagens.add(new ImageIcon("path"));
					case K : imagens.add(new ImageIcon("path"));
					}
				}
			}
			
			}
		}
		return imagens;
	}

}
