package classes;

public class Resume
{
	public static void main(String[] args) 
	{
		// Diferentes numeros
		Nums num = new Nums();
		num.f1(34f);
		
		// Contador
		Contador x = new Contador();
		for(int i = 0; i < 10; i++)
		{
			x.increment();
		}
		x.increment().increment().increment().print();
		
		// Card -> Primeiro inicializa todas as variáveis, daí a ordem dos prints
		Card c = new Card();
		c.f();
		
		// Person
		// Ok desde que todo o estudante seja uma pessoa
		Person p = new Student("John", 2781);
		// Student s = new Person("John");   <- Nao funciona (o estudante é uma pessoa mas nao o contrário)
		System.out.println(p);
		
		// Classe abstrata
		// Forma f = new Forma(); 	<- Não pode ser instanciada
		// Já pode pois a classe circulo não é abstrata (Circulo só deixa de ser abstrata quando
		// implementar todos os métodos da classe abstrata Forma!)
		Forma f = new Circulo();
		System.out.println(f.area());
	}
}

class Nums
{
	void f1(char x) {System.out.println("char");}
	void f1(byte x) {System.out.println("byte");}
	void f1(short x) {System.out.println("short");}
	void f1(int x) {System.out.println("int");}
	void f1(long x) {System.out.println("long");}
	void f1(float x) {System.out.println("float");}
	void f1(double x) {System.out.println("double");}
}

class Contador
{
	int i = 0;
	
	Contador increment()
	{
		i++;
		return this;
	}
	
	void print()
	{
		System.out.println("i: " + i);
	}
	
}

class Tag
{
	Tag(int m)
	{
		System.out.println(m);
	}
}

class Card
{
	Tag t1 = new Tag(1);
	Card()
	{
		t3 = new Tag(33);
	}
	Tag t2 = new Tag(2);
	void f()
	{
		System.out.println("f()");
	}
	Tag t3 = new Tag(3);	
}

class Explain
{
	public int a;		// Pode ser usado em qualquer classe
	int b;				// Visível dentro do mesmo package
	protected int c;	// Visível dentro do mesmo package e classes derivadas
	private int d;		// Apenas visível dentro da classe
	
	public int getD() 
	{
		return d;
	}
	
	public void setD(int d) 
	{
		this.d = d;
	}
}

class Student extends Person
{
	int nmec;
	
	Student(String name, int nmec)
	{
		super(name);
		this.nmec = nmec;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + nmec;
	}
}

class Person
{
	String name;
	
	Person(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}

abstract class Forma
{
	public abstract double area();
	public abstract double perimetro();
}

class Circulo extends Forma
{
	protected double r;
	
	public double area() 
	{
		return Math.PI * r * r;
	}
	
	public double perimetro() 
	{
		return 2 * Math.PI * r;
	}
}