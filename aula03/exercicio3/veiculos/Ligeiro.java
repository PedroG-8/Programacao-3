package aula03.exercicio3.veiculos;
import aula03.exercicio3.*;

public class Ligeiro extends Veiculo {
	
	private String cor;
	
	public Ligeiro(Condutor c, double cc, double hp, int lot, Carta tc, double peso, String cor) {
		super(c, cc, hp, lot, tc, peso);
		this.cor = cor;
	}

	public String cor() {
		return cor;
	}

	public void alterarCor(String c) {
		cor = c;
	}
	
	public String info() {
		return super.info() + "Cor: " + cor() + "\n";
	}
}

