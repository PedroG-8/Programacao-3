package aula05.exercicio2.test;
import aula05.exercicio2.*;

public class Test {

	public static void main(String[] args) {
		
		Veiculo[] v = new Veiculo[7];
		v[0] = new Automovel(Cor.preto, 2017, 250, 2500, 213, Combustivel.hibrido, 5.3, "24-TS-52", 5); 
		v[1] = new Moto(Cor.azul, 2009, 150, 250, 105, Combustivel.gasolina95, 3.5, "75-FG-63"); 
		v[2] = new Bicicleta(Cor.verde, 455); 
		v[3] = new CarroPolicia(Cor.roxo, 2010, 180, 1900, 115, Combustivel.gasoleo, 6.1, "36-GS-45", 4); 
		v[4] = new MotoPolicia(Cor.amarelo, 1999, 170, 125, 76, Combustivel.gasolina98, 2.8, "12-12-HO"); 
		v[5] = new BicicletaPolicia(Cor.vermelho, 230); 
		
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
			System.out.println("<------------------------------------------------->");
		}
	}
}
