package classes;

public class Lambda
{
	public static void main(String[] args) 
	{
		// MyNum
		MyNum n1 = (x) -> x + 1;
		MyNum n2 = (x) -> x + x;
		MyNum n3 = (x) -> x * x;
		
		System.out.println(n1.getNum(3));
		System.out.println(n2.getNum(3));
		System.out.println(n3.getNum(3));
		
		// Ecra
		Ecra xd = (String s) -> 
		{
			if(s.length() > 2)
			{
				System.out.print(s);
			}
			else
			{
				System.out.println("-");
			}
		};
		xd.escreve("Ola");
		xd.escreve("!");
		
		// NumericTest
		NumericTest isEven = (n) -> (n % 2) == 0;
		NumericTest isNeg = (n) -> (n < 0);
		int num = -12;
		if(isEven.test(num))
		{
			System.out.println("Number " + num + " is even.");	
		}
		else
		{
			System.out.println("Number " + num + " is not even.");
		}
		if(isNeg.test(num))
		{
			System.out.println("Number " + num + " is negative.");	
		}
		else
		{
			System.out.println("Number " + num + " is positive.");
		}
		
		// NumericTestTwo (Two parameters)
		NumericTestTwo isFactor = (n, d) -> (n % d) == 0;
		int num1 = 10, num2 = 1;
		if(isFactor.test(num1, num2))
		{
			System.out.println(num2 + " é divisor de " + num1);
		}
		else
		{
			System.out.println(num2 + " não é divisor de " + num1);
		}
		
		// NumericFunc
		NumericFunc factorialOf = (n) ->
		{
			int result = 1;
			for(int i = 1; i <= n; i++)
			{
				result = result * i;
			}
			return result;
		};
		num1 = 3;
		num2 = 5;
		System.out.println("The factorial of " + num1 + " is " + factorialOf.func(num1));
		System.out.println("The factorial of " + num2 + " is " + factorialOf.func(num2));
		
		// SomeFunc (interface genérica)
		SomeFunc<Integer> factorial = (n) ->
		{
			int res = 1;
			for(int i = 1; i <= n; i++)
			{
				res *= i;
			}
			return res;
		};
		SomeFunc<String> reverse = (s) ->
		{
			String str = "";
			for(int i = s.length() - 1; i >= 0; i--)
			{
				str = str + s.charAt(i);
			}
			return str;
		};
		System.out.println(factorial.func(4));
		System.out.println(reverse.func("Dinossauro"));
		System.out.println(stringOp(reverse, "Sou o pedro"));
		
		// Interface com método estático
		X.foo();
		
		// Print
		Print p = (s) -> System.out.println(s);
		p.print("system out simplificado");
	}
	
	// Função que recebe como parametros a expressao lambda e o seu argumento (String s)
	public static String stringOp(SomeFunc<String> str, String s)
	{
		return str.func(s);
	}
}

interface MyNum 
{
	double getNum(double n);
}

interface Ecra
{
	void escreve(String s);
}

interface NumericTest
{
	boolean test(int n);
}

interface NumericTestTwo
{
	boolean test(int n, int d);
}

interface NumericFunc
{
	int func(int n);
}

// Interface genérica
interface SomeFunc<T>
{
	T func(T n);
}

interface X
{
	static void foo()
	{
		System.out.println("Este método é estático");
	}
}

interface Print
{
	void print(String s);
}