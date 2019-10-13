package aula03.exercicio2;

public class Figura {
	
	protected Ponto centro;
	
	public Figura(Ponto centro) {
		this.centro = centro;
	}
	
	public Ponto getCentro() {
		return centro;
	}
	
	@Override
	public String toString() {
		return "Figura";
	}
}
