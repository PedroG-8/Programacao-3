package aula01.exercicio3;

public class Retangulo {

	private double largura;
	private double comprimento;
	
	public Retangulo(double l, double c) {
		largura = l;
		comprimento = c;
	}
	
	public double largura() {
		return largura;
	}
	
	public double comprimento() {
		return comprimento;
	}
	
	public double area() {
		return largura() * comprimento();
	}
	
	public double perimetro() {
		return (largura()) * 2 + (comprimento() * 2);
	}
	
	@Override
	public String toString() {
		if(largura() == comprimento()) {
			return String.format("É um quadrado de lado " + largura() + ", área " + area() + " e perímetro " + perimetro() + "\n");
		}
		else {
			return String.format("É um retângulo de largura " + largura() + ", comprimento " + comprimento + ", área " + area() + " e perimetro " + perimetro() + "\n");
		}
	}
}
