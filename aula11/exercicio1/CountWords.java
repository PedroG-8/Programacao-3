package aula11.exercicio1;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		File f = new File("..//p3//src//aula11//exercicio1//CountWords.txt");
		countWords(f);
	}
	
	public static void countWords(File f)
	{
		try
		{
			int i = 0;
			int equalWords = 0, totalWords = 0;
			ArrayList<String> storeWords = new ArrayList<String>();
			Scanner read = new Scanner(f);
			while(read.hasNext())
			{
				
				String s = read.next();
				storeWords.add(s);
				totalWords++;
			}	
			String[] words = new String[storeWords.size()];
			read.close();
			for (String string : storeWords) {
				words[i] = string;
				System.out.println(words[i]);
				i++;
			}
			for(int j = 0; j < words.length; j++)
			{
				String aux = words[j];
				for(int k = 0; k < words.length; k++)
				{
					if(aux.equals(words[k]) && j != k)
					{
						equalWords++;
					}
				}
			}
			System.out.println("Número Total de Palavras: " + totalWords);
			System.out.println("Número de Palavras Diferentes: " + equalWords );
		}
		catch(Exception e)
		{
			System.out.println("Erro ao ler ficheiro");
		}
	}

}
