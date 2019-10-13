package aula09.exercicio2;

class GeladoSimples implements Gelado {

	private String sabor;
	
	GeladoSimples(String sabor) { 
		this.sabor = sabor; 
	}

	@Override 
	public void base(int numBolas) {
		 System.out.print("\n" + numBolas + " bolas de gelado de " + sabor); 
	}
}
		
		
