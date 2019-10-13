package aula03.exercicio3.veiculos;
import aula03.exercicio3.Carta;
import aula03.exercicio3.Condutor;

public class PesadoPassageiros extends Veiculo {

private int numLugaresSentados; 	// Considerando que podem ir pessoas em pé
	
	public PesadoPassageiros(Condutor c, double cc, double hp, int lot, Carta tc, double peso, int nls) {
		super(c, cc, hp, lot, tc, peso);
		numLugaresSentados = nls;
	}

	public int numLugaresSentados() {
		numLugaresSentados = numLugaresSentados - numPassageiros();
		return numLugaresSentados;
	}
	
	public String info() {
		return super.info() + "Número de lugares sentados: " + numLugaresSentados() + "\n";
	}
}
