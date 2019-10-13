package aula09.exercicio2;

class Cone extends GeladoDecorador {

	Cone(Gelado g) {
		super(g);
	}
	
	@Override
	public void base(int numBolas) {
		g.base(numBolas);
		System.out.print(" em cone");
	}
	
}
