package Modelo;

public class Carta {
	
	protected int numero;
	protected Naipe naipe;
	protected boolean estaVirada;
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	
	

}
