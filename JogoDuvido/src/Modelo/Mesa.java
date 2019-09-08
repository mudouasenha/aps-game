package Modelo;

public class Mesa {
	
	protected Monte monte;
	protected int numeroDaRodada;
	protected Jogador[] participantes;
	
	
	
	public int getNumeroDaRodada() {
		return numeroDaRodada;
	}
	public void setNumeroDaRodada(int numeroDaRodada) {
		this.numeroDaRodada = numeroDaRodada;
	}
	public Monte getMonte() {
		return monte;
	}
	public Jogador[] getParticipantes() {
		return participantes;
	}
	
	

}
