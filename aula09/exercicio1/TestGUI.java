package aula09.exercicio1;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestGUI {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		int choice;
		while(true) {
			choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Ler do teclado\n2 - Ler ficheiro"));
			if(choice == 1 || choice == 2) break;
		}		
		
		if(choice == 1) {
			s = JOptionPane.showInputDialog("Frase: ");
			ScannerAbeirense scanString = new ScannerAbeirense(s);
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
