package aula06.exercicio2;

public class Estudante extends Pessoa {
	
	private static int primeiroMec = 100;
	private final int nMec;
	private final Data dataDeInsc;
	
	public Estudante(String nome, int cc, Data dataDeNasc, Data dataDeInsc) {
		super(nome, cc, dataDeNasc);
		this.nMec = primeiroMec++;
		this.dataDeInsc = dataDeInsc;
	}
	
	public Estudante(String nome, int cc, Data dataDeNasc){
		this(nome, cc, dataDeNasc, new Data());
	}
	
	public int nMec() {
		return nMec;
	}
	
	public Data dataDeInsc() {
		return this.dataDeInsc;
	}
	
	@ Override
	public String toString() {
		return super.toString() + ", NMec: " + nMec + ", Inscrito em Data: " + dataDeInsc;
	}
	
	
}
