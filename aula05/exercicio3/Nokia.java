package aula05.exercicio3;
import java.io.*;
import java.util.*;

public class Nokia implements FormatoDaAgenda {
	
	public Pessoa[] lerFicheiro(String filename) throws IOException{
		Scanner read = new Scanner(new File(filename));
		read.nextLine();
		List<Pessoa> lista = new ArrayList<>();
		while(read.hasNextLine()) {
			String nome = read.nextLine();
			int contacto = Integer.parseInt(read.nextLine());
			String[] data = read.nextLine().split("/");
			if(read.hasNextLine()) read.nextLine();
			lista.add(new Pessoa(nome,new Data(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2])),contacto));
		}
		read.close();
		return lista.toArray(new Pessoa[0]);
	}

	public void escreverParaFicheiro(String filename, Pessoa[] pessoas) throws IOException{
		PrintWriter pwf = new PrintWriter(new File(filename));
		pwf.println("Nokia");
		for(Pessoa pessoa : pessoas) {
			pwf.println(pessoa.nome());
			pwf.println(pessoa.contacto());
			pwf.println(pessoa.dataDeNasc());
			pwf.println();
		}
		pwf.close();
	}
	
}