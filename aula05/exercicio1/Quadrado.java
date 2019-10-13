package aula05.exercicio1;

public class Quadrado extends Figura {

	private double lado;
	
	public Quadrado(Ponto centro, double l) {
		super(centro);
		lado = l;
	}
	
	public Quadrado(Quadrado q) {
		this(q.centro, q.lado);
	}
	
	public Quadrado(double l) {
		this(new Ponto(), l);
	}
	
	public Quadrado(double x, double y, double l) {
		this(new Ponto(x, y), l);
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
	
	public Ponto centro() {
		return centro;
	}
	
	@Override
	public String toString() {
		return String.format("Quadrado de centro %s e de lado %1.1f", super.getCentro(), lado());
	}
	
	public boolean equals(Quadrado q) {
		return lado == q.lado && centro.equals(q.centro);
	}
	
}
