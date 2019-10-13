package aula05.exercicio2;

public class Automovel extends Motorizado{
	
	private int numPortas;
	
	public Automovel(Cor cor, int ano, int vm, int cc, int pot, Combustivel comb, double cons, String mat, int np) {
		super(cor, 4, 5, ano, vm, cc, pot, comb, cons, mat);
		numPortas = np;
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	
	@Override
	public String toString() {
		return "Automovel de " + getNumPortas() + " portas " + super.toString();
	}
}