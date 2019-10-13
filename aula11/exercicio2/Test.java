package aula11.exercicio2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Figura> fig = new ArrayList<Figura>();
		
		Circulo c1 = new Circulo(2);
		fig.add(c1);
		Circulo c2 = new Circulo(1, 3, 2);
		fig.add(c2);
		Quadrado q1 = new Quadrado(2);
		fig.add(q1);
		Quadrado q2 = new Quadrado(3, 4, 2);
		fig.add(q2);
		Retangulo r1 = new Retangulo(2, 3);
		fig.add(r1);
		Retangulo r2 = new Retangulo(3, 4, 2, 3);
		fig.add(r2);
		System.out.println(r2.maiorFigura(fig));
		
		
	}
}
