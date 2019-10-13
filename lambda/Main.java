package lambda;

public class Main
{
	public static void main(String[] args) 
	{
		Lambda n1;
		n1 = (x) -> x / x;
		System.out.println(n1.getNum(10));
		n1 = (x) -> x + 1;
		System.out.println(n1.getNum(10));
		n1 = (x) -> x * x + 11;
		System.out.println(n1.getNum(10));
		double y = 4;
		n1 = (x) -> x * y;
		System.out.println(n1.getNum(10));
	}
}
