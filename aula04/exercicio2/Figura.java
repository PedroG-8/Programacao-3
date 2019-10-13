package aula04.exercicio2;

public abstract class Figura {
	
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
	
	public abstract double area();
	
	public abstract double perimetro();

}
