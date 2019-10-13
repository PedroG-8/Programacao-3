package aula03.exercicio3.veiculos;
import aula03.exercicio3.Carta;
import aula03.exercicio3.Condutor;

public class PesadoMercadorias extends Veiculo{
	
	private double pesoMercadoria;
	private double pesoBruto;		// Peso total que o ve�culo suporta
	
	public PesadoMercadorias(Condutor c, double cc, double hp, int lot, Carta tc, double peso, double pm, double pb) {
		super(c, cc, hp, lot, tc, peso);
		pesoMercadoria = pm;
		pesoBruto = pb;
	}

	public double pesoMercadoria() {
		return pesoMercadoria;
	}
	
	public double adicionarMercadoria(double merc) throws Exception {
		if(pesoMercadoria + peso() + merc <= pesoBruto) {
			pesoMercadoria = pesoMercadoria + merc;
			return pesoMercadoria;
		}
		else {
			throw new Exception("O ve�culo n�o suporta tanto peso!");
		}
	}
	
	public double removerMercadoria(double merc) throws Exception {
		if(merc <= pesoMercadoria) {
			pesoMercadoria = pesoMercadoria - merc;
			return pesoMercadoria;
		}
		else {
			throw new Exception("N�o � possivel retirar essa quantidade de mercadorias!");
		}
	}
	
	public double pesoBruto() {
		return pesoBruto;
	}
	
	public String info() {
		return super.info() + "Peso da mercadoria: " + pesoMercadoria() + "\nPeso bruto: " + pesoBruto() + "\n";
	}
}
