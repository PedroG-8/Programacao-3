package aula05.exercicio2;

public class BicicletaPolicia extends Bicicleta implements Policia {

	public BicicletaPolicia(Cor cor, int preco) {
		super(cor, preco);
	}
	
	public TipoDeEmergencia getTipo() {
		return TipoDeEmergencia.PSP;
	}
	
	@Override
	public String toString() {
		return "Bicicleta da policia com 1 lugar (" + getPreco() + "€)";
	}
	
}
