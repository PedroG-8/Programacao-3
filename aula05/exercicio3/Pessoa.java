package aula05.exercicio3;

public class Pessoa {

	private final String nome;
	private final int contacto;
	private final Data dataDeNasc;
	
	public Pessoa(String nome, Data dataDeNasc, int contacto) {
		this.nome = nome;
		this.dataDeNasc = dataDeNasc;
		this.contacto = contacto;
	}
	
	public String nome() {
		return nome;
	}
	
	public int contacto() {
		return contacto;
	}

	public Data dataDeNasc() {
		return dataDeNasc;
	}
	
	@Override
	public String toString() {
		return toString(" ");
	}
	
	public String toString(String mid) {
		return nome + mid + contacto + mid + dataDeNasc;
	}
	
}
