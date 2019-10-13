package classes;
import java.awt.Color;

public class Main 
{
	public static void main(String[] args) 
	{
		Casa myHome = new Casa();
		Casa dois = new Casa();
		myHome.cor = Color.BLACK;
		myHome.numero = 25;
		Casa.arquiteto = "John";
		System.out.println(dois.numero);
		System.out.println(myHome.numero);
		System.out.println(Casa.arquiteto);
		String s1 = "a1aa";
		String s2 = "a1ba";
		int greater = s1.compareTo(s2);
		if(greater == 1)
			System.out.println(s1 + " maior");
		else if(greater == -1)
			System.out.println(s1 + " menor");
		else
			System.out.println("iguais");
	}
}
