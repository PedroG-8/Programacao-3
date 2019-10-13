package aula06.exercicio2;

public class Ponto {

	private final double x;
	private final double y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "x: " + getX() + ", y: " + getY();	
	}
	
	public double distanceTo(Ponto ponto) {
		return Math.sqrt(Math.pow(x - ponto.x, 2) + Math.pow(x - ponto.y,  2));
	}
	
	public boolean equals(Ponto ponto) {
		return x == ponto.x && y == ponto.y;
	}
}
