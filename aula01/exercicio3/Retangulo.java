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
			return String.format("� um quadrado de lado " + largura() + ", �rea " + area() + " e per�metro " + perimetro() + "\n");
		}
		else {
			return String.format("� um ret�ngulo de largura " + largura() + ", comprimento " + comprimento + ", �rea " + area() + " e perimetro " + perimetro() + "\n");
		}
	}
}
