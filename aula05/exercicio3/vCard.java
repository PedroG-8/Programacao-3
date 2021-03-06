package aula05.exercicio3;
import java.util.*;
import java.io.*;

public class vCard implements FormatoDaAgenda{

	public Pessoa[] lerFicheiro(String filename) throws IOException{
		Scanner read = new Scanner(new File(filename));
		read.nextLine();
		List<Pessoa> lista = new ArrayList<>();
		while(read.hasNextLine()) {
			String[] data = read.nextLine().split("#");
			String nome = data[1];
			int contacto = Integer.parseInt(data[2]);
			String[] date = data[3].split("/");
			lista.add(new Pessoa(nome,new Data(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2])),contacto));
		}
		read.close();
		return lista.toArray(new Pessoa[0]);
	}
	
	public void escreverParaFicheiro(String filename, Pessoa[] pessoas) throws IOException{
		PrintWriter pwf = new PrintWriter(new File(filename));
		pwf.println("vCard");
		for(Pessoa pessoa : pessoas) {
			pwf.println("#"+pessoa.toString("#"));
		}
		pwf.close();
	}

}