package aula03.exercicio3.test;
import aula03.exercicio3.*;
import aula03.exercicio3.veiculos.*;



public class Teste {

	public static void main(String[] args) throws Exception {
		
		Carta mota = new Carta("A");
		Carta ligeiros = new Carta("B");
		Carta pesadosMercadorias = new Carta("C");
		Carta pesadosPassageiros = new Carta("D");
		
		Data nascPedro = new Data (13, 4, 1999);
		Data nascMaria = new Data (26, 8, 1994);
		Data nascJoao = new Data (5, 5, 1996);
		Data nascAna = new Data (1, 2, 2000);
		
		Condutor Pedro = new Condutor("Pedro", 182732, nascPedro, ligeiros);
		Condutor Maria = new Condutor("Maria", 262732, nascMaria, pesadosPassageiros);
		Condutor Joao = new Condutor("Joao", 262732, nascJoao, pesadosMercadorias);
		Condutor Ana = new Condutor("Ana", 262732, nascAna, mota);
		
		Ligeiro carro = new Ligeiro(Pedro, 2000, 236, 5, ligeiros, 1500, "Preto");
		Mota motociclo = new Mota(Maria, 1200, 96, 2, mota, 500);
		PesadoMercadorias camiao = new PesadoMercadorias(Joao, 4000, 403, 2, pesadosMercadorias, 4500, 3000, 10000);
		PesadoPassageiros autocarro = new PesadoPassageiros(Ana, 5200, 352, 30, pesadosPassageiros, 5350, 20);
		
		// Testar Ligeiro
		
		carro.alterarCor("Verde");
		carro.adicionarPassageiro(Maria);
		carro.adicionarPassageiro(Joao);			
		carro.removerPassageiro(Maria);  			
		System.out.print(carro.info());
		System.out.println("---------------------------");
		
		// Testar Pesado de Mercadorias
		
		camiao.adicionarPassageiro(Pedro);
		
		try {
			camiao.adicionarMercadoria(5500);   // 5500 + 3000 de mercadoria inicial + 4500 de peso so do camiao = 13000 que é > 10000
		}catch(Exception e) {
			System.out.println(e);
		}
		
		camiao.removerMercadoria(2000);		
		
		try {
			camiao.removerMercadoria(1050); 	// Ao todo remove 3500 de mercadoria, quando o camiao apenas tem 3000
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.print(camiao.info());
		System.out.println("---------------------------");
		
		// Testar Mota
		
		motociclo.adicionarPassageiro(Ana);
		
		try {
			motociclo.adicionarPassageiro(Maria); 	//  Veiculo cheio
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		try {
			motociclo.numRodas(5); 		//  Numero de rodas impossivel
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		motociclo.numRodas(4);
		System.out.print(motociclo.info());
		System.out.println("---------------------------");
		
		// Testar Pesado Passageiros
	
		autocarro.adicionarPassageiro(Pedro);
		autocarro.adicionarPassageiro(Joao);
		autocarro.adicionarPassageiro(Maria);
		autocarro.adicionarPassageiro(Ana);
		System.out.print(autocarro.info());
	
	}

}
