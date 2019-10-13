package aula01.exercicio3;

public class Quadrado {

	private double lado;
	
	public Quadrado(double l) {
		lado = l;
	}
	
	public double lado() {
		return lado;
	}
	
	public double area() {
		return lado * lado;
	}
	
	public double perimetro() {
		return lado * 4;
	}
	
	public String toString() {
		return String.format("� um quadrado de lado " + lado() + ", �rea " + area() + " e per�metro " + perimetro() + "\n");
	}
	
}
