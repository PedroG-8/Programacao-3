package aula09.exercicio3;
import java.util.Scanner;
public class PersonList {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int a, numPeople = 0;
		
		do {
			
				System.out.print("Número de pessoas a adicionar (0 para ir para o menu): ");
				numPeople = kb.nextInt();
			
				Person[] newPerson = new Person[numPeople];
				Date[] newPersonDate = new Date[numPeople];
			
				for(int i = 0; i < newPerson.length; i++) {
				
					newPerson[i] = new Person();
					newPersonDate[i] = new Date();
					System.out.println();
					System.out.printf("Pessoa [%d]\n", i + 1);
					System.out.print("Nome: ");
					newPerson[i].name = kb.next();
					System.out.print("CC: ");
					newPerson[i].cc = kb.nextInt();
					System.out.println("Data de nascimento");
					System.out.print("Dia: ");
					newPersonDate[i].day = kb.nextInt();
					System.out.print("Mês: ");
					newPersonDate[i].month = kb.nextInt();
					System.out.print("Ano: ");
					newPersonDate[i].year = kb.nextInt();
			
				}
			

				System.out.println("------------------------------------");
				a = menu();
				
						
				if(a == 2) {
					if(numPeople == 0) {
						System.out.println("Não há ninguém para apagar!");
					} else {
						int del;
						System.out.println("Que pessoa pretende apagar?");
						
						for(int i = 0; i < numPeople; i++) {
							System.out.printf("[%d] %s\n", i + 1, newPerson[i].getName());
						}
						do {
							System.out.print(":");
							del = kb.nextInt();
						} while(del < 1 || del > numPeople);
					
						newPerson[del - 1] = new Person();
						newPersonDate[del - 1] = new Date();
						a = menu();
					}
				}
				
				if(a == 3) {
					if(numPeople == 0) {
						System.out.println("Não há nenhuma pessoa na lista!");
					} else {
						for(int i = 0; i < numPeople; i++) {
							System.out.printf("Pessoa [%d]\n", i + 1);
							System.out.printf("Nome: %s | CC: %d | Data de nascimento: %2d/%2d/%4d\n",
									newPerson[i].getName(), newPerson[i].getCC(), newPersonDate[i].day, 
									newPersonDate[i].month, newPersonDate[i].year);
						}
						a = menu();
					}
				}
			 
		} while(a != 0);
	}
	
	public static int menu() {
		int option;
		System.out.println("Menu");
		System.out.println("[1] Adicionar pessoas");
		System.out.println("[2] Apagar pessoas");
		System.out.println("[3] Lista de pessoas");
		System.out.println("[0] Sair");
		do {
			System.out.print("Opção: ");
			option = kb.nextInt();
		} while(option < 0 || option > 3);
		
		return option;
	}
}
