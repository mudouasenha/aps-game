package Modelo;

public class Carta {
	
	protected ValorDeCarta valor;
	protected Naipe naipe;
	protected boolean estaVirada;
	
	
	
	
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
	
	

}
