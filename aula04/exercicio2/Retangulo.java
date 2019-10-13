package aula04.exercicio2;

public class Retangulo extends Figura {

	private double comprimento;
	private double altura;
	
	public Retangulo(Ponto centro, double c, double a) {
		super(centro);
		comprimento = c;
		altura = a;		
	}
	
	public Retangulo(Retangulo r) {
		this(r.centro, r.comprimento, r.altura);
	}
	
	public Retangulo(double c, double a) {
		this(new Ponto(), c, a);
	}
	
	public Retangulo(double x, double y, double c, double a) {
		this(new Ponto(x, y), c, a);
	}
	
	public double comprimento() {
		return comprimento;
	}
	
	public double altura() {
		return altura;
	}
	
	public double area() {
		return comprimento * altura;
	}
	
	public double perimetro() {
		return (comprimento * 2) + (altura * 2);
	}

	public Ponto centro() {
		return centro;
	}
	
	@Override
	public String toString() {
		return String.format("Retangulo de centro %s, altura %1.1f, comprimento %1.1f", super.getCentro(), altura(), comprimento());
	}
	
	public boolean equals(Retangulo r) {
		return comprimento == r.comprimento && altura == r.altura && centro.equals(r.centro);
	}
}
