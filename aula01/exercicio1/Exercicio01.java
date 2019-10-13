package aula01.exercicio1;
import java.util.Scanner;
public class Exercicio01 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int d, w;
		
		String input, swappedLetters;
		System.out.print("Frase: ");
		input = kb.nextLine();
		d = numberOfDigits(input);
		w = wordsCount(input);
		swappedLetters = letterSwap(input);
		
		System.out.printf("Número de dígitos: %d\n",d);
		System.out.printf("Número de palavras: %d\n",w);
		
		if(lowerCaseChars(input)) {
			System.out.printf("A frase só tem carateres minusculos!\n");
		}
		if(upperCaseChars(input)) {
			System.out.printf("A frase só tem carateres maiusculos!\n");
		}
	
		System.out.printf("%s --> %s", input, swappedLetters);
	}
		
		public static int numberOfDigits(String a) {
			int n = 0;
			for(int i = 0; i < a.length(); i++) {
				if (Character.isDigit(a.charAt(i))) {
					n++;				
				}
			}
			return n;
		}
		
		public static boolean lowerCaseChars(String a) {
			int n = 0, l = 0;
			for(int i = 0; i < a.length(); i++) {
				if (Character.isLetter(a.charAt(i))) {
					l++;				
				}
				if (Character.isLowerCase(a.charAt(i))) {
					n++;				
				}
			}
			if (n == l)
			return true;
			else return false;
		}
		
		public static boolean upperCaseChars(String a) {
			int n = 0, l = 0;
			for(int i = 0; i < a.length(); i++) {
				if (Character.isLetter(a.charAt(i))) {
					l++;				
				}
				if (Character.isUpperCase(a.charAt(i))) {
					n++;				
				}
			}
			if (n == l)
			return true;
			else return false;
		}
		
		public static int wordsCount(String word) { 
			if (word == null || word.isEmpty()) { 
				return 0; 
				} 
			
			int wordCount = 0; 
			boolean isWord = false; 
			int endOfLine = word.length() - 1; 
			char[] characters = word.toCharArray(); 
			for (int i = 0; i < characters.length; i++) { 
				
				if (Character.isLetter(characters[i]) && i != endOfLine) { 
					isWord = true; 
				} 
				
				else if (!Character.isLetter(characters[i]) && isWord) { 
						wordCount++; isWord = false; 
						
				} 
				
				else if (Character.isLetter(characters[i]) && i == endOfLine) { 
						wordCount++; 
				} 
				
			} 
			return wordCount; 
		}
		
		public static String letterSwap(String word) {
			
			char[] c = word.toCharArray();
			
			for(int i = 0; i < word.length() - 1; i += 2) {
					
			char temp = c[i];
			c[i] = c[i+1];
			c[i+1] = temp;

			}
			String newString = new String(c);
			
			return newString;	
		}
		
}
		

			

	
