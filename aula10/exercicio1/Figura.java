package aula10.exercicio1;

public abstract class Figura implements Comparable<Figura>
{
	
	protected Ponto centro;
	
	public Figura(Ponto centro) 
	{
		this.centro = centro;
	}
	
	public Ponto getCentro() 
	{
		return centro;
	}
	
	@Override
	public String toString() 
	{
		return "Figura";
	}
	
	public abstract double area();
	
	public abstract double perimetro();

	public int compareTo(Figura f) 
	{
		return (int)(this.area() - f.area());
	}
	
}
