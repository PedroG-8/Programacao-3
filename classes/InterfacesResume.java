package classes;
import java.awt.Color;
import classes.Externa.InternaTres;

public class InterfacesResume 
{
	public static void main(String[] args) 
	{
		// Overrides das classes
		CirculoGrafico c = new CirculoGrafico();
		c.sayHello("Pedro");
		
		// Indica se uma referencia é instancia de uma classe ou interface
		if(c instanceof CirculoGrafico)
		{
			System.out.println("É instancia");	
		}
		
		// compareTO
		String[] str = {"John", "Pedro", "Diogo", "Maria", "Ana", "Beatriz"};
		System.out.println(FindMaxDemo.findMax(str));
		
		// Como é estatica tem de ser acedida assim (Externa.InternaDois)
		Externa.InternaDois classeInterior = new Externa.InternaDois();
		classeInterior.metodoInterno();
		
		// Não é estatica, logo é acedida assim
		InternaTres e = (new Externa()).new InternaTres();
		e.campo3 = "Nao estática";
		
		// Enumeração
		for(Tipos t : Tipos.values())
		{
			System.out.println(t);
		}
		Tipos[] cidades = Tipos.values();
		System.out.println(cidades[0]);
		
		Planet[] planets = Planet.values();
		for(Planet p : planets)
		{
			System.out.printf("\n%s\nMass: %3.2e kg\nRadius: %3.2e m\nSurface Gravity: %4.2f m/s^2\n",
					p.name(), p.mass(), p.radius(), p.surfaceGravity());
		}
	}
}

// Todos os métodos sao implicitamente abstratos
// As variáveis sao implicitamente estaticas e constantes
interface Desenhavel
{
	// Pode ser reescrito na classe que o implementa
	default void sayHello(String name)
	{
		System.out.println("Hello");
	}
	// É estático logo nao pode ser reescrito na classe que o implementa
	static void sayHi(String name)
	{
		System.out.println("Hi");
	}
	public void cor(Color c);
	public void corDeFundo(Color cf);
	public void posiçao(double x, double y);
	public void desenha();
}

// A classe que implementa a interface se nao for abstrata tem de implementar todos
// os métodos da interface
class CirculoGrafico implements Desenhavel
{
	@Override
	public void sayHello(String name)
	{
		System.out.println("Hello " + name);
	}

	public void cor(Color c)
	{
		System.out.println("Cor: " + c);
	}

	public void corDeFundo(Color cf)
	{
		System.out.println("Cor de fundo: " + cf);		
	}

	public void posiçao(double x, double y) 
	{
		System.out.println("Posição: (" + x + "," + y + ")");
	}

	public void desenha() 
	{
		System.out.println("Desenhado");
	}
}

class FindMaxDemo
{
	@SuppressWarnings("unchecked")
	public static <T> int findMax(Comparable<T>[] a)
	{
		int maxIndex = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != null && a[i].compareTo((T) a[maxIndex]) > 0)
			{
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}

class Rectangle implements Cloneable
{
	// Shallow copy (cópia campo a campo)
	@Override
	protected Rectangle clone() throws CloneNotSupportedException
	{
		return (Rectangle) super.clone();
	}
	
	// Deep cloning (cria uma réplica de  todos os objetos que podem ser alcançados a partir
	// do objeto que estamos a replicar)
//	@Override
//	protected Rectangle clone() throws CloneNotSupportedException
//	{
//		return new Rectangle();
//	}
}

class Externa
{
	// Nao da para aceder
	private static class InternaUm
	{
		public int campo1;
	}
	public static class InternaDois extends InternaUm
	{
		public int campo2;
		public void metodoInterno()
		{
			System.out.println("Metodo interno da classe InternaDois");
		}
	}
	public class InternaTres
	{
		public String campo3;
	}
	public static interface Coisa
	{
		void existe();
	}
	public void metodoExterno()
	{
		System.out.println("Metodo externo");
	}
}

enum Tipos
{
	ALDEIA, VILA,
	CIDADE
	{
		public String toString()
		{
			return "Isto é uma cidade";
		}
	},
	CAPITAL
	{
		public String toString()
		{
			return "Isto é uma capital";
		}
	}
}

enum Planet
{
	MERCURY (3.303e+23, 2.4397e6),
	VENUS (4.869e+24, 6.0518e6),
	EARTH (5.976e+24, 6.37814e6),
	MARS (6.421e+23, 3.3972e6),
	JUPITER (1.9e+27, 7.1492e7),
	SATURN (5.688e+26, 6.0268e7),
	URANUS (8.686e+25, 2.5559e7),
	NEPTUNE (1.024e+26, 2.4746e7),
	PLUTO (1.27e+22, 1.137e6);
	
	private final double mass;		// Em kg
	private final double radius;	// Em metros
	
	Planet(double mass, double radius)
	{
		this.mass = mass;
		this.radius = radius;
	}

	public double mass()
	{
		return mass;
	}
	
	public double radius()
	{
		return radius;
	}
	
	public static final double G = 6.673e-11;
	
	public double surfaceGravity()
	{ 
		return G * mass / (radius * radius);
	}
	
	public double surfaceWeight(double otherMass)
	{
		return otherMass * surfaceGravity();
	}
}