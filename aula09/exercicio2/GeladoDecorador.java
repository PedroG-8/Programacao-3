package aula09.exercicio2;

abstract class GeladoDecorador implements Gelado {
	
	protected Gelado g;
	
	GeladoDecorador(Gelado g) {
		this.g = g;
	}
	
	public void base(int numBolas) {
		g.base(numBolas);
	}
}
