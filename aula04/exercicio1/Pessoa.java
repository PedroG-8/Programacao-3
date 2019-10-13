package aula04.exercicio1;

public class Pessoa {

	private final String nome;
	private final int cc;
	private final Data dataDeNasc;
	
	public Pessoa(String nome, int cc, Data dataDeNasc) {
		this.nome = nome;
		this.cc = cc;
		this.dataDeNasc = dataDeNasc;
	}
	
	public String nome() {
		return nome;
	}
	
	public int cc() {
		return cc;
	}

	public Data dataDeNasc() {
		return dataDeNasc;
	}
	
	@Override
	public String toString() {
		return nome + ", BI: " + cc + ", Data de nascimento: " + dataDeNasc;
	}
	
}
