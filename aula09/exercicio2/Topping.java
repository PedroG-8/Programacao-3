package aula09.exercicio2;

class Topping extends GeladoDecorador {

	private String top;
	
	public Topping(Gelado g, String top) {
		super(g);
		this.top = top;
	}
	
	public void base(int numBolas) {
		g.base(numBolas);
		System.out.print(" com " + top);
	}
}
