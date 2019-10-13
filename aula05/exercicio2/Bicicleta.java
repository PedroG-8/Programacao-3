package aula05.exercicio2;

public class Bicicleta extends Veiculo {

	private final int preco;
	
	public Bicicleta(Cor cor, int preco) {
		super(cor, 2, 1);
		this.preco = preco;
	}
	
	public int getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return "Bicicleta " + super.toString() + " (" + getPreco() + "€)";
	}
}
