package aula04.exercicio3;
import java.util.*;
import aula04.exercicio3.utilizadores.*;

public class Menu {
	
	static VideoClube videoClube = new VideoClube(5);
	static  Scanner kb = new Scanner(System.in);
	
	public static void main (String args[]) {
		
		while(true){
			int option = -1;
			
			System.out.println("---------------------------------------------");
			System.out.println("|               Video Clube                 |");
			System.out.println("---------------------------------------------");
			System.out.println("| 1 - Introduzir utilizador do VideoClube   |");
			System.out.println("| 2 - Remover utilizador do VideoClube      |");
			System.out.println("| 3 - Listar videos de um utilizador        |");
			System.out.println("| 4 - Historico de videos de um utilizador  |");
			System.out.println("| 5 - Introduzir filme no VideoClube        |");
			System.out.println("| 6 - Remover filme do VideoClube           |");
			System.out.println("| 7 - Verificar a disponibilidade de um item|");
			System.out.println("| 8 - Efetuar o empréstimo de um item       |");
			System.out.println("| 9 - Efetuar a devolução de um item        |");
			System.out.println("| 10 - Ver o catálogo de videos             |");
			System.out.println("| 11 - Ver o catálogo de videos por rating  |");
			System.out.println("| 0 - Sair do programa                      |");
			System.out.println("---------------------------------------------");
			System.out.print("Opção: ");
			
			try{
				option = Integer.parseInt(kb.nextLine());
			}
			catch(NumberFormatException e){
				printError();
			}
			System.out.println("------------------------------------------");
			try {
				if(option == 1) addUser();
				else if(option == 2) removeUser();
				else if(option == 3) listUserVideos();
				else if(option == 4) listUserVideoHistory();
				else if(option == 5) addVideo();
				else if(option == 6) removeVideo();
				else if(option == 7) checkAvailability();
				else if(option == 8) lendVideo();
				else if(option == 9) returnVideo();
				else if(option == 10) printCatalog();
				else if(option == 11) printCatalogByRating();
				else if(option == 0) break;
				else throw new IllegalArgumentException();
			}catch(Exception e) {
				printError();
			}
			System.out.println("\n##########################################\n");
		}
	}
	
	static void addUser() {
	
		System.out.println("1 - Estudante");
		System.out.println("2 - Funcionário");
		System.out.print("Tipo: ");
		int type = Integer.parseInt(kb.nextLine());
		if(type == 1) {
			System.out.print("Nome: ");
			String name = kb.nextLine();
			System.out.print("Curso: ");
			String course = kb.nextLine();
			System.out.print("CC: ");
			int cc = Integer.parseInt(kb.nextLine());
			System.out.print("NMEC: ");
			int nmec = Integer.parseInt(kb.nextLine());
			System.out.print("Data de Nascimento (dd-mm-aaaa): ");
			String[] date = kb.nextLine().split("-");
			int day = Integer.parseInt(date[0]);
			int month = Integer.parseInt(date[1]);
			int year = Integer.parseInt(date[2]);
			videoClube.addUser(new Estudante(name,course,cc,nmec,new Data(day,month,year)));
		}
		else if(type == 2) {
			System.out.print("Nome: ");
			String name = kb.nextLine();
			System.out.print("Número Fiscal: ");
			int fiscalNumber = Integer.parseInt(kb.nextLine());
			System.out.print("CC: ");
			int cc = Integer.parseInt(kb.nextLine());
			System.out.print("Número de Funcionário: ");
			int workerNumber = Integer.parseInt(kb.nextLine());
			System.out.print("Data de Nascimento (dd-mm-aaaa): ");
			String[] date = kb.nextLine().split("-");
			int day = Integer.parseInt(date[0]);
			int month = Integer.parseInt(date[1]);
			int year = Integer.parseInt(date[2]);
			videoClube.addUser(new Funcionario(name,fiscalNumber,cc,workerNumber,new Data(day,month,year)));
		}
		System.out.println("Utilizador adicionado com sucesso");
		
	}
	
	static void removeUser() {
		System.out.print("CC do utilizador: ");
		videoClube.removeUser(Integer.parseInt(kb.nextLine()));
		System.out.println("Utilizador removido com sucesso");
	}
	
	static void listUserVideos() {
		System.out.print("CC do utilizador: ");
		videoClube.printUserVideos(Integer.parseInt(kb.nextLine()));
	}
	
	static void listUserVideoHistory() {
		System.out.print("CC do utilizador: ");
		videoClube.printUserVideoHistory(Integer.parseInt(kb.nextLine()));
	}
	
	static void addVideo() {
		
		System.out.print("Título: ");
		String title = kb.nextLine();
		System.out.print("Idade (ALL - M6 - M12 - M16 - M18): ");
		String age = kb.nextLine();
		System.out.println("1 - Ação");
		System.out.println("2 - Comédia");
		System.out.println("3 - Infantil");
		System.out.println("4 - Drama");
		System.out.print("Categoria: ");
		int categoryNum = Integer.parseInt(kb.nextLine());
		String category = null;
		
		if(categoryNum == 1) category = "Action";
		else if(categoryNum == 2) category = "Comedy";
		else if(categoryNum == 3) category = "Children";
		else if(categoryNum == 4) category = "Drama";
		
		
		videoClube.addVideo(title,age,category);
		System.out.println("Video adicionado com sucesso");
	}
	
	static void removeVideo() {
		System.out.print("ID do video: ");
		videoClube.removeVideo(Integer.parseInt(kb.nextLine()));
	}
	
	static void checkAvailability() {
		System.out.print("ID do video: ");
		videoClube.checkAvailability(Integer.parseInt(kb.nextLine()));
	}
	
	static void lendVideo() {
		System.out.print("ID do video: ");
		int id = Integer.parseInt(kb.nextLine());
		System.out.print("CC do utilizador: ");
		int cc = Integer.parseInt(kb.nextLine());
		videoClube.lendVideo(id,cc);
	}
	
	static void returnVideo() {
		System.out.print("ID do video: ");
		int id = Integer.parseInt(kb.nextLine());
		System.out.print("CC do utilizador: ");
		int cc = Integer.parseInt(kb.nextLine());
		System.out.print("Rating(0-10): ");
		int r = Integer.parseInt(kb.nextLine());
		if(r<0||r>10) {
			printError();
			return;
		}
		videoClube.returnVideo(id,cc,r);
	}
	
	static void printCatalog() {
		videoClube.printCatalog();
	}
	
	static void printCatalogByRating() {
		videoClube.printCatalogByRating();
	}
	
	static void printError(){
		System.out.println("Input inválido");
	}
}