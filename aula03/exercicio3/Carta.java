package aula03.exercicio3;

public class Carta {

	private final String tipoDeCarta;
	
	public Carta(String tipo) {
		if(!tipo.equals("A") && !tipo.equals("B") && !tipo.equals("C") && !tipo.equals("D")) {
			throw new IllegalArgumentException("Tipo errado de carta!");
		}
		else {
			tipoDeCarta = tipo;
		}
	}
	
	public boolean equals(Carta c) {
		return tipoDeCarta.equals(c.tipoDeCarta);
	}
	
	public boolean equals(String t) {
		return tipoDeCarta.equals(t);
	}
	
	@Override
	public String toString() {
		return tipoDeCarta;
	}
}
