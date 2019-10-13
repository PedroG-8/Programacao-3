package aula03.exercicio3;

public class Pessoa {

	private String nome;
	private int cc;
	private Data dataDeNascimento;
	
	public Pessoa(String nome, int cc, Data dn) {
		this.nome = nome;
		this.cc = cc;
		dataDeNascimento = dn;
	}
	
	public String nome() {
		return nome;
	}
	
	public int cc() {
		return cc;
	}
	
	public Data dataDeNascimento() {
		return dataDeNascimento;
	}
	
	public boolean equals(Pessoa c) {
		return cc == c.cc;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", CC: " + cc + ", data de nascimento : " + dataDeNascimento;
	}
	
}
