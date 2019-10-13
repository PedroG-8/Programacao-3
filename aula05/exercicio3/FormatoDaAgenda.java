package aula05.exercicio3;
import java.io.*;

public interface FormatoDaAgenda {

	public Pessoa[] lerFicheiro(String nomeFicheiro) throws IOException;
	
	public void escreverParaFicheiro(String nomeFicheiro, Pessoa[] pessoas) throws IOException;
}
