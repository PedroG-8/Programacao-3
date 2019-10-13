package aula03.exercicio3.veiculos;
import aula03.exercicio3.Carta;
import aula03.exercicio3.Condutor;

public class Mota extends Veiculo {
	
	private int numRodas = 2;
	
	public Mota(Condutor c, double cc, double hp, int lot, Carta tc, double peso) {
		super(c, cc, hp, lot, tc, peso);
	}

	public int numRodas() {
		return numRodas;
	}
	
	public void numRodas(int n) throws Exception {
		if(n > 1 && n < 5) {
			numRodas = n;
		}
		else {
			throw new Exception("Não existem motas com esse número de rodas!");
		}
	}
	
	public String nomeDaMota() {
		if(numRodas == 2) {
			return "é uma mota.";
		}
		else if(numRodas == 3) {
			return "é um triciclo.";
		}
		else {
			return "é uma moto 4.";
		}
	}
	
	public String info() {
		return super.info() + "Tem " + numRodas() +" rodas logo, " + nomeDaMota() + "\n";
	}
}
