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
			System.out.println("ERRO: N�o consegue escrever para o ficheiro\n");
		
		System.out.println();
		aeroporto.printAtrasos();
		System.out.println();
		
		if(aeroporto.writeToBinaryFile("Infopublico.bin")) 
			System.out.println("Escrito com sucesso para o ficheiro bin�rio\n");
		else
			System.out.println("ERRO: N�o consegue escrever para o ficheiro bin�rio\n");
		
		if(aeroporto.readFromBinaryAndPrint("Infopublico.bin")) 
			System.out.println("Ficheiro bin�rio lido com sucesso\n");
		else
			System.out.println("ERRO: N�o consegue ler o ficheiro bin�rio\n");

	}

}
