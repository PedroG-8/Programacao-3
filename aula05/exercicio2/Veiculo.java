package aula05.exercicio2;

public class Veiculo {

	static int ID_Veiculo = 1;
	private Cor cor;
	private final int numRodas;
	private final int id;
	private final int lotacao;
	
	public Veiculo(Cor cor, int nr, int lot) {
		this.cor = cor;
		numRodas = nr;
		lotacao = lot;
		id = ID_Veiculo++;
	}
	
	public Veiculo(int nr, int lot) 
	{
		cor = Cor.amarelo;
		numRodas = nr;
		lotacao = lot;
		id = ID_Veiculo++;
	}
	
	public int getID() {
		return id;
	}
	
	public int getNumRodas() {
		return numRodas;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public int getLotacao() {
		return lotacao;
	}
	
	@Override
	public String toString() {
		if(getLotacao() == 1) {
			return cor + " com " + getLotacao() + " lugar";
		}
		else {
			return cor + " com " + getLotacao() + " lugares";
		}
	}
}
