package aula01.exercicio3.test;
import aula01.exercicio3.*;

public class Test {

	public static void main(String[] args) {
		
		Ponto p1 = new Ponto(3, 4);
		Ponto p2 = new Ponto();
		
		Circulo c1 = new Circulo(p1, 2);
		Circulo c2 = new Circulo(3, 1, 4);
		Circulo c3 = new Circulo(5, 3, 2);
		
		Quadrado q1 = new Quadrado(3);
		
		Retangulo r1 = new Retangulo(2,2);
		Retangulo r2 = new Retangulo(1,4);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(r2);
		System.out.print(r1);
		System.out.print(q1);
		System.out.println(c2.circulosIntersetam(c1));
		System.out.println(c2.circulosIguais(c1));
		System.out.println(c1.circulosIguais(c3));
		System.out.print(p2);
	}

}
