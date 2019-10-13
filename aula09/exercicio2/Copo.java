package aula09.exercicio2;

class Copo extends GeladoDecorador {

	public Copo(Gelado g) {
		super(g);
	}
	
	public void base(int numBolas) {
		g.base(numBolas);
		System.out.print(" em copo");
	}
}
