package aula07.exercicio1;

public class Companhia {

	private final String nome;
	private final String sigla;
	
	public Companhia(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
