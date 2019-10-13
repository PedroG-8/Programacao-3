package aula05.exercicio2;

public class MotoPolicia extends Moto implements Policia {
	
	public MotoPolicia(Cor cor, int ano, int vm, int cc, int pot, Combustivel comb, double cons, String mat) {
		super(cor, ano, vm, cc, pot, comb, cons, mat);
	}
	
	public TipoDeEmergencia getTipo() {
		return TipoDeEmergencia.PSP;
	}
	
	@Override 
	public String toString() {
		return "Moto da polica (" + getTipo() + ") " + "de " + getAno() + "\n"
				+ "Velocidade m�xima: " + getVelMax() + " km/h\n"
				+ "Cilindrada " + getCC() + " cm3\n"
				+ "Potencia: " + getPotencia() + " cv\n"
				+ "Combust�vel: " + getCombustivel() + "\n"
				+ "Consumo m�dio: " + getConsumo() + "l/100km\n"				
				+ "Matr�cula: " + getMatricula();
	}
}
