package aula07.exercicio1.test;
import java.io.IOException;
import aula07.exercicio1.*;

public class Test {

	public static void main(String[] args) throws IOException {

		Aeroporto aeroporto = new Aeroporto("companhias.txt","voos.txt");
		aeroporto.printToScreen();
		System.out.println();
		
		if(aeroporto.writeToFile("Infopublico.txt")) 
			System.out.println("Escrito com sucesso para o ficheiro\n");
		else 
			System.out.println("ERRO: Não consegue escrever para o ficheiro\n");
		
		System.out.println();
		aeroporto.printAtrasos();
		System.out.println();
		
		if(aeroporto.writeToBinaryFile("Infopublico.bin")) 
			System.out.println("Escrito com sucesso para o ficheiro binário\n");
		else
			System.out.println("ERRO: Não consegue escrever para o ficheiro binário\n");
		
		if(aeroporto.readFromBinaryAndPrint("Infopublico.bin")) 
			System.out.println("Ficheiro binário lido com sucesso\n");
		else
			System.out.println("ERRO: Não consegue ler o ficheiro binário\n");

	}

}
