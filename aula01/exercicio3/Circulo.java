package aula01.exercicio3;

public class Circulo {

	private double raio;
	private Ponto centro;
	
	public Circulo(double x, double y, double r) {
		centro = new Ponto(x, y);
		raio = r;
	}
	
	public Circulo(Ponto centro, double r) {
		this.centro = centro;
		raio = r;
	}
	
	public double raio() {
		return raio;
	}
	
	public Ponto centro() {
		return centro;
	}
	
	public double area() {
		return Math.PI * raio() * raio();
	}
	
	public double perimetro() {
		return 2 * Math.PI * raio();
	}
	
	public double distanciaAoPonto(Ponto p) {
		return Math.sqrt(Math.pow(centro.getX() - p.getX(), 2) + Math.pow(centro.getY() - p.getY(), 2));
	}
		
	public boolean circulosIguais(Circulo c) {
		if(raio() == c.raio()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean circulosIntersetam(Circulo c) {
		if(distanciaAoPonto(c.centro()) <= raio() + c.raio()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override 
	public String toString() {
		return String.format("Circulo de centro em (" + centro.getX() + ")," + centro.getY() + ", raio " + raio() + ", área %1.2f e perimetro %1.2f\n",
				area(), perimetro());
	}
}
