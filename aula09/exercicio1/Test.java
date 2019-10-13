package aula09.exercicio1;
import java.io.File;
import java.util.Scanner;

public class Test {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int choice;
		while(true) {
			System.out.println("1 - Para ler do teclado");
			System.out.println("2 - Para ler ficheiro");
			System.out.print(": ");
			choice = kb.nextInt();
			if(choice == 1 || choice == 2) break;
		}		
		
		if(choice == 1) {
			System.out.print("Frase: ");
			ScannerAbeirense scanString = new ScannerAbeirense(System.in);
			System.out.println(scanString.next());
			scanString.close();
		}
		else if(choice == 2) {
			
			File f = new File("Aveiro.txt");
			ScannerAbeirense scanFile = new ScannerAbeirense(f);
			
			while(scanFile.hasNext()) {
				System.out.println(scanFile.next());
			}
			scanFile.close();
		}	
	}
}
