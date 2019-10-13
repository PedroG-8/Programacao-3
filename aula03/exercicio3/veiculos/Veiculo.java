package aula03.exercicio3.veiculos;
import java.util.ArrayList;

import aula03.exercicio3.Pessoa;
import aula03.exercicio3.*;

public class Veiculo {

	private ArrayList <Pessoa> passageiros;   // O condutor n�o conta como passageiro
	private Condutor condutor;
	private Carta tipoDeCarta;
	private final double cilindrada;
	private final double potencia;
	private final int lotacao;
	private final double peso;
	
	public Veiculo(Condutor c, double cc, double hp, int lot, Carta tc, double peso) {
		cilindrada = cc;
		potencia = hp;
		lotacao = lot;
		tipoDeCarta = tc;
		this.peso = peso;
		condutor = c;
		passageiros = new ArrayList<>();
	}
	
	public boolean cartaValida() {
		return tipoDeCarta.equals(condutor.carta());
	}
	
	public void adicionarPassageiro(Pessoa p) throws Exception {
		if(numPassageiros() < lotacao - 1) {    // Lotacao - 1 por causa do condutor que nao conta como passageiro
			passageiros.add(p);
		}
		else {
			throw new Exception("O ve�culo est� cheio, n�o � possivel adicionar mais ningu�m!");
		}
	}
	
	public void removerPassageiro(Pessoa p) throws Exception {
		if(numPassageiros() > 0) {
			passageiros.remove(p);
		}
		else {
			throw new Exception("O ve�culo est� vazio, n�o � poss�vel remover nenhum passageiro!");
		}
	}
	
	public String info() {
		return "Condutor: " + condutor.nome() + "\nN�mero de passageiros: " + numPassageiros() + "\nLota��o: " + lotacao() +
				"\nCilindrada: " + cilindrada() + "\nPotencia: " + potencia() + "\nPeso: " + peso() + "\n";
	}
	
	public Condutor condutor() {
		return condutor;
	}
	
	public int numPassageiros() {    // N�mero de passageiros sem contar com o condutor
		return passageiros.size();
	}
	
	public int lotacao() {
		return lotacao;
	}
	
	public double cilindrada() {
		return cilindrada;
	}
	
	public double potencia() {
		return potencia;
	}
	
	public double peso() {
		return peso;
	}
	
	public void alterarCondutor(Condutor c) {
		condutor = c;
	}
	
	@Override
	public String toString() {
		return "Ve�culo";
	}
	
	
	
	
}
