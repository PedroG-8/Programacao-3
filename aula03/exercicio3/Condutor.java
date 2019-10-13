package aula03.exercicio3;

public class Condutor extends Pessoa {
	
	private final Carta carta;
	
	public Condutor(String nome, int cc, Data dn, Carta carta) {
		super(nome, cc, dn);
		this.carta = carta;
	}
	
	public Carta carta() {
		return carta;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", tipo de carta: " + carta + "\n";
	}
	
	

}
