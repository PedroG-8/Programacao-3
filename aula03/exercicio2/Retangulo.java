package aula03.exercicio2;

public class Retangulo extends Figura {

	private double comprimento;
	private double largura;
	
	public Retangulo(Ponto centro, double c, double l) {
		super(centro);
		comprimento = c;
		largura = l;		
	}
	
	public Retangulo(Retangulo r) {
		this(r.centro, r.comprimento, r.largura);
	}
	
	public Retangulo(double c, double l) {
		this(new Ponto(), c, l);
	}
	
	public Retangulo(double x, double y, double c, double l) {
		this(new Ponto(x, y), c, l);
	}
	
	public double comprimento() {
		return comprimento;
	}
	
	public double largura() {
		return largura;
	}
	
	public double area() {
		return comprimento * largura;
	}
	
	public double perimetro() {
		return (comprimento * 2) + (largura * 2);
	}

	public Ponto centro() {
		return centro;
	}
	
	@Override
	public String toString() {
		return "Retangulo";
	}
	
	public boolean equals(Retangulo r) {
		return comprimento == r.comprimento && largura == r.largura && centro.equals(r.centro);
	}
}
