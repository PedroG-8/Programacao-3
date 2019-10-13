package aula06.exercicio2;

public abstract class Figura implements Comparable<Figura> {
	
	protected Ponto centro;
	
	public Figura(Ponto centro) {
		this.centro = centro;
	}
	
	public Ponto getCentro() {
		return centro;
	}
	
	@Override
	public String toString() {
		return "Figura";
	}
	
	public abstract double area();
	
	public abstract double perimetro();

	public int compareTo(Figura figura) {
		if(this.area() - figura.area() > 0) return 1;
		else if(this.area() - figura.area() < 0) return -1;
		else return 0;
	}
}
