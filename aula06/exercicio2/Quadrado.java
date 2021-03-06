package aula06.exercicio2;

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
		return "Quadrado de centro " + super.getCentro() + " e de lado " + lado();
	}
	
	public boolean equals(Quadrado q) {
		return lado == q.lado && centro.equals(q.centro);
	}
	
}
