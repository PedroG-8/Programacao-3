package aula04.exercicio1;

public class Bolseiro extends Estudante {
	
	private int bolsa;
	
	public Bolseiro(String nome, int cc, Data dataDeNasc, Data dataDeInsc) {
		super(nome, cc, dataDeNasc, dataDeInsc);
	}
	
	public Bolseiro(String nome, int cc, Data dataDeNasc) {
		super(nome, cc, dataDeNasc);
	}
	
	public int bolsa() {
		return bolsa;
	}
	
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Bolsa: " + bolsa;
	}

}
