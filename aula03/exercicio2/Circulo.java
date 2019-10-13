package aula03.exercicio2;

public class Circulo extends Figura {

	private final double raio;
	
	public Circulo(Ponto centro, double r) {
		super(centro);
		raio = r;
	}
	
	public Circulo(Circulo c1) {
		this(c1.getCentro(), c1.raio());
	}
	
	public Circulo(double r) {
		this(new Ponto(), r);
	}
	
	public Circulo(double x, double y, double r) {
		this(new Ponto(x, y), r);
	}
	
	public double raio() {
		return raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * raio;
	}
	
	@Override
	public String toString() {
		return "Círculo";
	}
	
	public boolean equals(Circulo c1) {
		return c1.raio == raio;
	}
	
	public boolean intersect(Circulo c1) {
		return raio + c1.raio > centro.distanceTo(c1.centro);
	}
}



