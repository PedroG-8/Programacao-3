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
		return String.format("É um quadrado de lado " + lado() + ", área " + area() + " e perímetro " + perimetro() + "\n");
	}
	
}
