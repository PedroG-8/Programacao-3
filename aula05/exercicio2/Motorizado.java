package aula05.exercicio2;

public class Motorizado extends Veiculo {

	private final int ano;
	private final int velocidadeMax;
	private final int cilindrada;
	private final String matricula;
	private final int potencia;
	private final Combustivel combustivel;
	private final double consumo;
	
	public Motorizado(Cor cor, int nr, int lot, int ano, int vm, int cc, int pot, Combustivel comb, double cons, String mat) {
		super(cor, nr, lot);
		this.ano = ano;
		velocidadeMax = vm;
		cilindrada = cc;
		potencia = pot;
		combustivel = comb;
		consumo = cons;
		matricula = mat;
	}
	
	public int getAno() {
		return ano;
	}
	
	public int getVelMax() {
		return velocidadeMax;
	}
	
	public int getCC() {
		return cilindrada;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public Combustivel getCombustivel() {
		return combustivel;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "de " + getAno() + " " + super.toString() + "\n"
				+ "Velocidade m�xima: " + getVelMax() + " km/h\n"
				+ "Cilindrada " + getCC() + " cm3\n"
				+ "Potencia: " + getPotencia() + " cv\n"
				+ "Combust�vel: " + getCombustivel() + "\n"
				+ "Consumo m�dio: " + getConsumo() + "l/100km\n"				
				+ "Matr�cula: " + getMatricula();
	}
}
