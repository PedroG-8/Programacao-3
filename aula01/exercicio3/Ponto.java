package aula01.exercicio3;

public class Ponto {

	private double x;
	private double y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		x = 0;
		y = 0;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	@Override 
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
	
}
