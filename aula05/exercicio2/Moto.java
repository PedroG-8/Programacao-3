package aula05.exercicio2;

public class Moto extends Motorizado {

	public Moto(Cor cor, int ano, int vm, int cc, int pot, Combustivel comb, double cons, String mat) {
		super(cor, 2, 2, ano, vm, cc, pot, comb, cons, mat);
	}
	
	@Override
	public String toString() {
		return "Moto de " + super.toString();
	}
}
	

