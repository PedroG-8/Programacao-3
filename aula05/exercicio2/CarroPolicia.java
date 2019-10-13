package aula05.exercicio2;

public class CarroPolicia extends Automovel implements Policia {
	
	public CarroPolicia(Cor cor, int ano, int vm, int cc, int pot, Combustivel comb, double cons, String mat, int np) {
		super(cor, ano, vm, cc, pot, comb, cons, mat, np);
	}
	
	public TipoDeEmergencia getTipo() {
		return TipoDeEmergencia.PJ;
	}
	
	@Override 
	public String toString() {
		return "Carro da polica (" + getTipo() + ") " + "de " + getAno() + "\n"
				+ "Velocidade m�xima: " + getVelMax() + " km/h\n"
				+ "Cilindrada " + getCC() + " cm3\n"
				+ "Potencia: " + getPotencia() + " cv\n"
				+ "Combust�vel: " + getCombustivel() + "\n"
				+ "Consumo m�dio: " + getConsumo() + "l/100km\n"				
				+ "Matr�cula: " + getMatricula();
	}
}
